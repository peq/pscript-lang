package de.peeeq.parseq;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.base.Charsets;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.common.io.Files;

import de.peeeq.parseq.ast.Alternative;
import de.peeeq.parseq.ast.AstBaseTypeDefinition;
import de.peeeq.parseq.ast.AstEntityDefinition;
import de.peeeq.parseq.ast.AttributeDef;
import de.peeeq.parseq.ast.CaseDef;
import de.peeeq.parseq.ast.ConstructorDef;
import de.peeeq.parseq.ast.ListDef;
import de.peeeq.parseq.ast.Parameter;
import de.peeeq.parseq.ast.Program;

public class Generator {

	private static final String PARSEQ_COMMENT = "//generated by parseq";
	private Multimap<CaseDef, AstBaseTypeDefinition> baseTypes =   HashMultimap.create();
	private Multimap<AstEntityDefinition, AstEntityDefinition> directChildTypes = HashMultimap.create();

	private Multimap<AstEntityDefinition, AstEntityDefinition> directParentType = HashMultimap.create();
	private Multimap<AstEntityDefinition, AstEntityDefinition> directSubTypes = HashMultimap.create();
	private Multimap<AstEntityDefinition, AstEntityDefinition> directSuperTypes = HashMultimap.create();
	private Multimap<AstBaseTypeDefinition, CaseDef> interfaceTypes = HashMultimap.create();
	private String mainName;
	private List<File> oldFiles = new LinkedList<File>();
	private String outputFolder;
	private String packageName;
	private Program prog;
	private Multimap<AstEntityDefinition, AstEntityDefinition> transientChildTypes = HashMultimap.create();
	private Multimap<AstEntityDefinition, AstEntityDefinition> transientSubTypes;
	private Multimap<AstEntityDefinition, AstEntityDefinition> transientSuperTypes;
	
	private Map<String, Parameter> parameters = Maps.newHashMap();

	public Generator(Program prog, String p_outputFolder) {
		System.out.println(prog);
		
		
		this.prog = prog;
		this.outputFolder = new File(p_outputFolder).getAbsolutePath() + "/";
		this.packageName = prog.getPackageName();
		this.outputFolder += packageName.replace('.', '/') + '/';
		this.mainName = prog.getLastPackagePart();

		File file = new File(this.outputFolder);
		if (!file.exists()) {
			System.out.println("Creating directory " + file);
			file.mkdirs();
		} else {
			System.out.println("Output directory " + file + " already exists");

			for (File s : file.listFiles()) {
				if (s.toString().endsWith(".java")) {
					oldFiles.add(s);
				}
			}

		}

	}

	private void abort(String string) {
		System.err.println(string);
		System.exit(1);
	}

	private void caclulateCaseDefBaseTypes(CaseDef caseDef) {
		if (baseTypes.containsKey(caseDef)) {
			return; // already calculated
		}
		for (AstEntityDefinition sub : directSubTypes.get(caseDef)) {
			if (sub instanceof AstBaseTypeDefinition) {
				baseTypes.put(caseDef, (AstBaseTypeDefinition) sub);
			} else if (sub instanceof CaseDef) {
				CaseDef caseDef2 = (CaseDef) sub;
				caclulateCaseDefBaseTypes(caseDef2);
				for (AstBaseTypeDefinition sub2 : baseTypes.get(caseDef2)) {
					baseTypes.put(caseDef, sub2);
				}
			}
		}
	}

	private Set<Parameter> calculateAttributes(CaseDef c) {
		Set<Parameter> commonAttributes = null;
		for (AstBaseTypeDefinition base : baseTypes.get(c)) {
			if (base instanceof ConstructorDef) {
				ConstructorDef baseClass = (ConstructorDef) base;
				Set<Parameter> attributes = Sets.newHashSet();
				for (Parameter p : baseClass.parameters) {
					attributes.add(p);
				}
				if (commonAttributes == null) {
					commonAttributes = attributes;
				} else {
					commonAttributes = Sets.intersection(commonAttributes, attributes);
				}
			} else if (base instanceof ListDef) {
				return Sets.newHashSet();
			} else {
				throw new Error("Case not possible.");
			}
		}
		if (commonAttributes == null) {
			commonAttributes = Sets.newHashSet();
		}
		return commonAttributes;
	}

	private void calculateContainments() {
		for (ConstructorDef c : prog.constructorDefs) {
			for (Parameter a : c.parameters) {
				addContainmentInfo(c, prog.getElement(a.typ));
			}
		}
		for (ListDef l : prog.listDefs) {
			addContainmentInfo(l, prog.getElement(l.itemType));
		}
		
		calculateTransientChildTypes();
	}

	private void calculateTransientChildTypes() {
		transientChildTypes = HashMultimap.create();
		transientChildTypes.putAll(directChildTypes);
		boolean changed;
		do {
			HashMultimap<AstEntityDefinition, AstEntityDefinition> newTransitions = HashMultimap.create();
			for (Entry<AstEntityDefinition, AstEntityDefinition> e : transientChildTypes.entries()) {
				AstEntityDefinition parent = e.getKey();
				AstEntityDefinition child = e.getValue();
				
				// reflexive:
				newTransitions.put(parent, parent);
				newTransitions.put(child, child);
				
				// add transitive childs
				for (AstEntityDefinition trChild : transientChildTypes.get(child)) {
					newTransitions.put(parent, trChild);
				}
				
				// add subtypes of child:
				for (AstEntityDefinition sub : transientSubTypes.get(child)) {
					newTransitions.put(parent, sub);
				}
				
				// add supertypes of parent:
				for (AstEntityDefinition sup : transientSuperTypes.get(parent)) {
					newTransitions.put(sup, child);
				}
			}
			changed = transientChildTypes.putAll(newTransitions);
		} while (changed); 
		// must terminate because there are only finitely many possible transitions
		// and every iteration adds at least one
		// runtime might be quite bad however			
	}

	private void addContainmentInfo(AstEntityDefinition parent, AstEntityDefinition child) {
		directParentType.put(child, parent);
		directChildTypes.put(parent, child);
	}

	private void calculateSubTypes() {
		for (CaseDef caseDef : prog.caseDefs) {
			for (Alternative alt : caseDef.alternatives) {
				AstEntityDefinition subType = prog.getElement(alt.name);
				directSubTypes.put(caseDef, subType);
				directSuperTypes.put(subType, caseDef);
			}
		}
		// calculate base types of interfaces:
		for (CaseDef caseDef : prog.caseDefs) {
			caclulateCaseDefBaseTypes(caseDef);
		}
		
		// calculate interfaces for base types:
		for (CaseDef caseDef : prog.caseDefs) {
			for (AstBaseTypeDefinition base : baseTypes.get(caseDef)) {
				interfaceTypes.put(base, caseDef);
			}
		}
		
		transientSubTypes = transientClosure(directSubTypes);
		transientSuperTypes = transientClosure(directSuperTypes);
	}

	private void createFile(String name, StringBuilder sb) {
		String filename = outputFolder + name + ".java";
		File file = new File(filename);

		boolean writeFile = false;
		if (file.exists()) {
			// file already exists -> compare contents
			try {
				String content = Files.toString(file, Charsets.UTF_8);
				if (!sb.toString().equals(content)) {
					// files differ, rewrite:
					writeFile = true;
				}
			} catch (IOException e) {
				abort("Error: Could not read file " + filename);
			}
		} else {
			// file does not exist -> write it
			writeFile = true;
		}
		
		
		if (writeFile) {
			System.out.println("writing file " + file);
			try {
				Files.write(sb, file, Charsets.UTF_8);
			} catch (IOException e) {
				abort("Error: Could not write file " + filename);
			}
		} else {
			System.out.println("not changed: " + file);
		}
		oldFiles.remove(file);
	}

	private void createMatchMethods(AstBaseTypeDefinition c, StringBuilder sb) {
		// create match methods
		for (CaseDef superType : interfaceTypes.get(c)) {
			sb.append("	@Override public <T> T match(" + superType.name + ".Matcher<T> matcher) {\n");
			sb.append("		return matcher.case_" + c.getName() + "(this);\n");
			sb.append("	}\n");
			
			sb.append("	@Override public void match(" + superType.name + ".MatcherVoid matcher) {\n");
			sb.append("		matcher.case_" + c.getName() + "(this);\n");
			sb.append("	}\n\n");
		}
	}

	void generate() {
		System.out.println("calculating types ... ");
		calculateProperties();
		calculateSubTypes();
		calculateContainments();
		
		generateStandardClasses();
		generateStandardList();
		
		
		System.out.println("generating property interfaces ... ");
		generatePropertyInterfaces();
		
		System.out.println("generating interfaces ... ");
		generateInterfaceTypes();
		
		System.out.println("generating base classes ... ");
		generateBaseClasses();
		
		System.out.println("generating list classes ...");
		generateLists();
		
		
		generateFactoryClass();
		
		removeOldFiles();
		System.out.println("Done.");
	}

	private void generatePropertyInterfaces() {
		for (Parameter p : parameters.values()) {
			String interfaceName = getPropertyInterfaceName(p);
			StringBuilder sb = new StringBuilder();
			printProlog(sb);
			sb.append("public interface ");
			sb.append(interfaceName);
			sb.append(" extends ");
			sb.append(getCommonSupertypeType());
			sb.append(" { ");
			sb.append("	void set" + toFirstUpper(p.name) + "(" + p.typ + " " + p.name + ");\n");
			sb.append("	" + p.typ + " get" + toFirstUpper(p.name) + "();\n");
			sb.append("}\n");
			createFile(interfaceName, sb);
		}
	}

	/**
	 * calculate which properties exist
	 */
	private void calculateProperties() {
		for (ConstructorDef c : prog.constructorDefs) {
			for (Parameter  p : c.parameters) {
				Parameter oldP = parameters.put(p.name, p);
				if (oldP != null) {
					if (!oldP.typ.equals(p.typ)) {
						throw new Error("The property " + p.name + " has not the same type for each element: " + oldP.typ + " and " + p.typ);
					}
				}
			}
		}
	}

	private void generateBaseClass_Impl(ConstructorDef c) {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
		sb.append("class " + c.name + "Impl implements ");
		sb.append(c.name +  ", " + getCommonSupertypeType() + "Intern {\n");

		// create constructor
		createConstructor(c, sb);

		// get/set parent method:
		createGetSetParentMethods(sb);

		// create getters and setters for parameters:
		createGetterAndSetterMethods(c, sb);
		
		//get method
		int childCount = createGetMethod(c, sb);
		
		//size method
		createSizeMethod(sb, childCount);
		
		//copy method
		createCopyMethod(c, sb, childCount);
		
		// accept method for visitor
		createAcceptMethods(c, sb);
		
		// match methods for switch
		createMatchMethods(c, sb);
		
		// toString method
		createToString(c, sb);
		
		createAttributeImpl(c, sb);		
		
		sb.append("}\n");
		createFile(c.name + "Impl", sb);
	}

	private void createAttributeImpl(AstBaseTypeDefinition c, StringBuilder sb) {
		for (AttributeDef attr : prog.attrDefs) {
			boolean hasAttribute = attr.typ.equals(c.getName());
			for (AstEntityDefinition sup : transientSuperTypes.get(c)) {
				hasAttribute |= attr.typ.equals(sup.getName());
			}
			hasAttribute |= attr.typ.equals(getCommonSupertypeType());
			
			if (hasAttribute) {
				if (attr.parameters == null) {
					sb.append("	private int zzattr_" + attr.attr + "_state = 0;\n");
					sb.append("	private " + attr.returns + " zzattr_" + attr.attr + "_cache;\n");
					sb.append("/** " + attr.comment + "*/\n");
					sb.append("	public " + attr.returns + " " + attr.attr + "() {\n");
					sb.append("		if (zzattr_" + attr.attr + "_state == 0) {\n");
					sb.append("			zzattr_" + attr.attr +"_state = 1;\n");
					sb.append("			zzattr_" + attr.attr +"_cache = "+attr.implementedBy+"(this);\n");
					sb.append("			zzattr_" + attr.attr +"_state = 2;\n");
					sb.append("		} else if (zzattr_" + attr.attr + "_state == 1) {\n");
					sb.append("			throw new Error(\"Cyclic dependencies between types\");\n");
					sb.append("		}\n");
					sb.append("		return zzattr_" + attr.attr +"_cache;\n");
					sb.append("	}\n");
				} else {
					sb.append("/** " + attr.comment + "*/\n");
					sb.append("	public " + attr.returns + " " + attr.attr + "("+printParams(attr.parameters)+") {\n");
					if (attr.returns.equals("void")) {
						sb.append("		"+attr.implementedBy+"(this"+printArgs(attr.parameters)+");\n");
					} else {
						sb.append("		return "+attr.implementedBy+"(this"+printArgs(attr.parameters)+");\n");
					}
					sb.append("	}\n");
				}
			}
		}
	}

	private String printArgs(List<Parameter> parameters2) {
		String result = "";
		for (Parameter p : parameters2) {
			result += ", " + p.name;  
		}
		return result;
	}

	private String printParams(List<Parameter> parameters2) {
		if (parameters2 == null) {
			return "";
		}
		String result = "";
		boolean first = true;
		for (Parameter p : parameters2) {
			if (!first) {
				result +=", ";
			}
			result += p.typ + " " + p.name;  
			first = false;
		}
		return result;
	}

	private void createConstructor(ConstructorDef c, StringBuilder sb) {
		sb.append("	" + c.name + "Impl(");
		boolean first = true;
		for (Parameter p : c.parameters) {
			if (!first) {
				sb.append(", ");
			}
			sb.append(p.typ + " " + p.name);
			first = false;
		}
		sb.append(") {\n");
		for (Parameter p : c.parameters) {
			if (!JavaTypes.primitiveTypes.contains(p.typ)) { 
				// add null checks for non primitive types:
				sb.append("		if (" + p.name	+ " == null) throw new IllegalArgumentException();\n");
				if (isGeneratedTyp(p.typ) && !p.isRef) {
					// we have a generated type. 
					// the new element has a new parent:
					sb.append("		(("+getCommonSupertypeType()+"Intern)" + p.name + ").setParent(this);\n");
				}
			}
			sb.append("		this." + p.name + " = " + p.name + ";\n");
		}
		sb.append("	}\n\n");
	}

	private boolean isGeneratedTyp(String typ) {
		for (CaseDef c : prog.caseDefs) {
			if (c.getName().equals(typ)) {
				return true;
			}
		}
		for (ConstructorDef c : prog.constructorDefs) {
			if (c.getName().equals(typ)) {
				return true;
			}
		}
		for (ListDef c : prog.listDefs) {
			if (c.getName().equals(typ)) {
				return true;
			}
		}
		return false;
	}

	private void createGetSetParentMethods(StringBuilder sb) {
		sb.append("	private " + getCommonSupertypeType() + " parent;\n");
		sb.append("	public " + getCommonSupertypeType() + " getParent() { return parent; }\n");
		sb.append("	public void setParent(" + getCommonSupertypeType() + " parent) {\n" +
				"		if (parent != null && this.parent != null) { " +
				"			throw new Error(\"Parent of \" + this + \" already set: \" + this.parent + \"\\ntried to change to \" + parent); " +
				"		}\n" +
				"		this.parent = parent;\n" +	
				"	}\n\n");
	}

	private void createGetterAndSetterMethods(ConstructorDef c, StringBuilder sb) {
		for (Parameter p : c.parameters) {
			sb.append("	private " + p.typ + " " + p.name + ";\n");
			// setter:
			sb.append("	public void set" + toFirstUpper(p.name) + "(" + p.typ + " " + p.name + ") {\n");
			if (!JavaTypes.primitiveTypes.contains(p.typ)) { 
				// add null checks for non primitive types:
				sb.append("		if (" + p.name	+ " == null) throw new IllegalArgumentException();\n");
				if (isGeneratedTyp(p.typ) && !p.isRef) {
					// we have a generated type. 
					// the removed type looses its parent:
					sb.append("		(("+getCommonSupertypeType()+"Intern)this." + p.name + ").setParent(null);\n");
					// the new element has a new parent:
					sb.append("		(("+getCommonSupertypeType()+"Intern)" + p.name + ").setParent(this);\n");
				}
			}
			sb.append("		this." + p.name + " = " + p.name + ";\n" + "	} \n");
			// getter
			sb.append("	public " + p.typ + " get" + toFirstUpper(p.name) + "() { return " + p.name + "; }\n\n");
		}
	}

	private int createGetMethod(ConstructorDef c, StringBuilder sb) {
		sb.append("	public "+getCommonSupertypeType()+" get(int i) {\n");
		sb.append("		switch (i) {\n");
		int childCount = 0;
		for (Parameter p : c.parameters) {
			if (prog.hasElement(p.typ)) {
				sb.append("			case "+childCount+": return "+p.name+";\n");
				childCount++;
			}
		}
		sb.append("			default: throw new IllegalArgumentException(\"Index out of range: \" + i);\n");
		sb.append("		}\n");
		sb.append("	}\n");
		return childCount;
	}

	private void createSizeMethod(StringBuilder sb, int childCount) {
		sb.append("	public int size() {\n");
		sb.append("		return " + childCount + ";\n");
		sb.append("	}\n");
	}

	private void createCopyMethod(ConstructorDef c, StringBuilder sb, int childCount) {
		boolean first;
		sb.append("	@Override public " + c.name + " copy() {\n");
		sb.append("		return new " + c.name + "Impl(");
		first = true;
		for (Parameter p : c.parameters) {
			if (!first) {
				sb.append(", ");
			}
			if (prog.hasElement(p.typ)) {
				sb.append("(" + p.typ + ") " + p.name+".copy()");
				childCount++;
			} else {
				sb.append(p.name);
			}			
			first = false;
		}
		sb.append(");\n");
		sb.append("	}\n");
	}

	private void createAcceptMethods(ConstructorDef c, StringBuilder sb) {
		for (AstEntityDefinition parent : transientChildTypes.keySet()) {
			if (transientChildTypes.get(parent).contains(c)) {
				sb.append("	@Override public void accept(" + parent.getName()+".Visitor v) {\n");
				for (Parameter p : c.parameters) {
					if (prog.hasElement(p.typ)) {
						sb.append("		" + p.name + ".accept(v);\n");
					}
				}
				sb.append("		v.visit(this);\n");
				sb.append("	}\n");
			}
		}
	}

	private void createToString(ConstructorDef c, StringBuilder sb) {
		boolean first;
		sb.append("	@Override public String toString() {\n");
		sb.append("		return \"" + c.name);
		if (c.parameters.size() > 0) {
			sb.append("(\" + ");
			first = true;
			for (Parameter p : c.parameters) {
				if (!first) {
					sb.append(" + \", \" +");
				}
				sb.append(p.name);
				first = false;
			}
			sb.append("+\")\"");
		} else {
			sb.append("\"");
		}
		sb.append(";\n");
		sb.append("	}\n");
	}

	private void generateBaseClass_Interface(ConstructorDef c) {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
		sb.append("public interface " + c.name + " extends ");
		sb.append(getCommonSupertypeType());
		for (AstEntityDefinition supertype : directSuperTypes.get(c)) {
			sb.append(", ");
			sb.append(supertype.getName());
		}
		// create getters and setters for parameters:
//		for (Parameter p : c.parameters) {
//			sb.append("	void set" + toFirstUpper(p.name) + "(" + p.typ + " " + p.name + ");\n");
//			sb.append("	" + p.typ + " get" + toFirstUpper(p.name) + "();\n");
//		}
		for(Parameter p: c.parameters) {
			sb.append(", ");
			sb.append(getPropertyInterfaceName(p));
		}
		
		sb.append(" {\n");

		// getParent method:
		sb.append("	" + getCommonSupertypeType() + " getParent();\n");

		
		
		// copy method
		sb.append("	" + c.name + " copy();\n");
		
		generateVisitorInterface(c, sb);
		

		createAttributeStubs(c, sb);
		
		sb.append("}\n");
		createFile(c.name, sb);
	}

	private String getPropertyInterfaceName(Parameter p) {
		return getCommonSupertypeType()+"With"+ toFirstUpper(p.name);
	}
	
	private void generateVisitorInterface(AstEntityDefinition d, StringBuilder sb) {
//		sb.append("	interface SpecificVisitor {\n");
//		sb.append("		void visit(" +d.getName()+" " + toFirstLower(d.getName()) +");\n");
//		sb.append("	}\n");
		
		// create accept methods for every Visitor type that could get here:
		for (AstEntityDefinition parent : transientChildTypes.keySet()) {
			if (transientChildTypes.get(parent).contains(d)) {
				sb.append("	public abstract void accept(" + parent.getName()+".Visitor v);\n");
			}
		}
//		sb.append("	public abstract void accept(Visitor v);\n");
		
		
		Collection<AstEntityDefinition> childTypes = transientChildTypes.get(d);
		// Visitor interface
		sb.append("	public interface Visitor");
		sb.append(" {\n");
		sb.append("");
		for (AstEntityDefinition contained : childTypes) {
			if (contained instanceof AstBaseTypeDefinition) {
				AstBaseTypeDefinition c = (AstBaseTypeDefinition) contained;
				sb.append("		void visit(" +c.getName()+" " + toFirstLower(c.getName()) +");\n");
			}
		}
		sb.append("	}\n");
		
		// Default Visitor
		sb.append("	public static abstract class DefaultVisitor implements Visitor {\n");
		for (AstEntityDefinition contained : childTypes) {
			if (contained instanceof AstBaseTypeDefinition) {
				AstBaseTypeDefinition c = (AstBaseTypeDefinition) contained;
				sb.append("		@Override public void visit(" +c.getName()+" " + toFirstLower(c.getName()) +") {}\n");
			}
		}
		sb.append("	}\n");
	}

	private void generateBaseClasses() {
		for (ConstructorDef c : prog.constructorDefs) {
			generateBaseClass_Interface(c);
			generateBaseClass_Impl(c);
		}
	}

	private void generateFactoryClass() {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
		
		sb.append("public class " + toFirstUpper(prog.getLastPackagePart()) + " {\n");
	
		for (ConstructorDef c : prog.constructorDefs) {
			sb.append("	public static " + c.name + " " + c.name + "(");
			boolean first = true;
			for (Parameter a : c.parameters) {
				if (!first) {
					sb.append(", ");
				}
				sb.append(a.typ + " " + a.name);
				first = false;
			}
			sb.append(") {\n");
			sb.append("		return new " + c.name + "Impl(");
			first = true;
			for (Parameter a : c.parameters) {
				if (!first) {
					sb.append(", ");
				}
				sb.append(a.name);
				first = false;
			}
			sb.append(");\n");
			sb.append("	}\n");
			
		}
		
		
		for (ListDef l : prog.listDefs) {
			sb.append("	public static " + l.name + " " + l.name + "(" + l.itemType + " ... elements ) {\n");
			sb.append("		" + l.name + " l = new " + l.name + "Impl();\n");
			sb.append("		for (" + l.itemType + " e : elements) { l.add(e); }\n");
			sb.append("		return l;\n");
			sb.append("	}\n");
			
			
			sb.append("	public static " + l.name + " " + l.name + "(Iterable<" + l.itemType + "> elements ) {\n");
			sb.append("		" + l.name + " l = new " + l.name + "Impl();\n");
			sb.append("		for (" + l.itemType + " e : elements) { l.add(e); }\n");
			sb.append("		return l;\n");
			sb.append("	}\n");
		}
		
		
		sb.append("}");
		createFile(toFirstUpper(prog.getLastPackagePart()), sb);
	}

	private void generateInterfaceType(CaseDef c) {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
		sb.append("public interface " + c.name + " extends ");
		sb.append(getCommonSupertypeType());
		for (AstEntityDefinition supertype : directSuperTypes.get(c)) {
			sb.append(", ");
			sb.append(supertype.getName());
		}
		// calculate common attributes:
		Set<Parameter> attributes = calculateAttributes(c);
		
		// create getters and setters for parameters:
//		for (Parameter p : attributes) {
//			sb.append("	void set" + toFirstUpper(p.name) + "(" + p.typ + " " + p.name + ");\n");
//			sb.append("	" + p.typ + " get" + toFirstUpper(p.name) + "();\n");
//		} 
		for (Parameter p : attributes) {
			sb.append(", ");
			sb.append(getPropertyInterfaceName(p));
		}
		sb.append("{\n");

		// getParent method:
		sb.append("	" + getCommonSupertypeType() + " getParent();\n");
		
		
		
		// create match methods:		
		sb.append("	<T> T match(Matcher<T> s);\n");
		sb.append("	void match(MatcherVoid s);\n");
		
		// create Matcher interface:
		sb.append("	public interface Matcher<T> {\n");
		for (AstBaseTypeDefinition baseType : baseTypes.get(c)) {
			sb.append("		T case_" + baseType.getName() + "(" + baseType.getName() + " " + toFirstLower(baseType.getName())+ ");\n");
		}
		sb.append("	}\n\n");

		// create MatchVoid interface:
		sb.append("	public interface MatcherVoid {\n");
		for (AstBaseTypeDefinition baseType : baseTypes.get(c)) {
			sb.append("		void case_" + baseType.getName() + "(" + baseType.getName() + " " + toFirstLower(baseType.getName())+ ");\n");
		}
		sb.append("	}\n\n");
		
		// copy method
		sb.append("	" + getCommonSupertypeType() + " copy();\n");

		generateVisitorInterface(c, sb);
		
		createAttributeStubs(c, sb);
		
		
		sb.append("}\n");
		createFile(c.name, sb);
	}

	
	private void createAttributeStubs(AstEntityDefinition c, StringBuilder sb) {
		for (AttributeDef attr : prog.attrDefs) {
			if (attr.typ.equals(c.getName())) {
				sb.append("/** " + attr.comment + "*/\n");
				sb.append("	public abstract " + attr.returns + " " + attr.attr + "("+printParams(attr.parameters)+");\n");
			}
		}
	}

	public static String join(List<String> list, String sep) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String s: list) {
			if (!first) {
				sb.append(sep);
			}
			sb.append(s);
			first = false;
		}
		return sb.toString();
	}

	private void generateInterfaceTypes() {
		for (CaseDef caseDef : prog.caseDefs) {
			generateInterfaceType(caseDef);
		}
	}

	private void generateList(ListDef l) {
		generateList_interface(l);
		generateList_impl(l);
	}

	private void generateList_impl(ListDef l) {
		StringBuilder sb;
		sb = new StringBuilder();
		printProlog(sb);
		sb.append("class " + l.name + "Impl extends "+l.name+" implements "+getCommonSupertypeType()+"Intern {\n ");
		
		createGetSetParentMethods(sb);
		
		sb.append("	protected void other_setParentToThis("+l.itemType+" t) {\n");
		if (isGeneratedTyp(l.itemType)) {
			sb.append("		(("+getCommonSupertypeType()+"Intern) t).setParent(this);\n");
		}
		sb.append("	}\n");
		
		sb.append("	protected void other_clearParent("+l.itemType+" t) {\n");
		if (isGeneratedTyp(l.itemType)) {
			sb.append("		(("+getCommonSupertypeType()+"Intern) t).setParent(null);\n");
		}
		sb.append("	}\n");
		
		
		// match methods for switch
		createMatchMethods(l, sb);
		
		
		// accept methods for visitors
		for (AstEntityDefinition parent : transientChildTypes.keySet()) {
			if (transientChildTypes.get(parent).contains(l)) {
				sb.append("	@Override public void accept(" + parent.getName()+".Visitor v) {\n");
				sb.append("		for (" +l.itemType+ " i : this ) {\n");
				sb.append("			i.accept(v);\n");
				sb.append("		}\n");
				sb.append("		v.visit(this);\n");
				sb.append("	}\n");
			}
		}
		
		createAttributeImpl(l, sb);
		
		// toString method
		sb.append("	@Override public String toString() {\n");
		sb.append("		String result =  \""+l.getName()+"(\";\n");
		sb.append("		boolean first = true;\n");
		sb.append("		for (" +l.itemType+ " i : this ) {\n");
		sb.append("			if (!first) { result +=\", \"; }\n");
		sb.append("			if (result.length() > 1000) { result +=\"...\"; break; }\n");
		sb.append("			result += i;\n");
		sb.append("			first = false;\n");
		sb.append("		}\n");
		sb.append("		result +=  \")\";\n");
		sb.append("		return result;\n");
		sb.append("	}\n");
		
		sb.append("}\n");
		createFile(l.name + "Impl", sb);
	}

	private void generateList_interface(ListDef l) {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
		sb.append("public abstract class " + l.name + " extends ParseqList<"+l.itemType+"> implements ");
		sb.append(getCommonSupertypeType());
		for (AstEntityDefinition supertype : directSuperTypes.get(l)) {
			sb.append(", ");
			sb.append(supertype.getName());
		}
		sb.append("{\n");

		
		// copy method
		sb.append("	public " + l.name + " copy() {\n");
		sb.append("		" + l.name + " result = new "+l.name+"Impl();\n");
		sb.append("		for ("+ l.itemType +" elem : this) {\n");
		sb.append("			result.add(("+l.itemType+") elem.copy());\n");
		sb.append("		}\n");
		sb.append("		return result;\n");
		sb.append("	}\n");
		
		generateVisitorInterface(l, sb);
		
		createAttributeStubs(l, sb);
		
		
		sb.append("}\n");
		createFile(l.name, sb);
	}

	private void generateLists() {
		for (ListDef l : prog.listDefs) {
			generateList(l);
		}
	}

	private void generateStandardClasses() {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
		
		sb.append("public interface "+getCommonSupertypeType()+" {\n" +
				"	"+getCommonSupertypeType()+" getParent();\n" +
				"	int size();\n" +
				"	"+getCommonSupertypeType()+" get(int i);\n"+
				"	void setParent("+getCommonSupertypeType()+" parent);\n");
		for (AttributeDef attr : prog.attrDefs) {
			if (attr.typ.equals(getCommonSupertypeType())) {
				sb.append("	"  +attr.returns + " " + attr.attr + "();\n");
			}
		}
		sb.append("}\n\n");
		
		sb.append("interface "+getCommonSupertypeType()+"Intern {\n" +
				"	void setParent("+getCommonSupertypeType()+" pos);\n" +
				"}\n\n");
		
		createFile(getCommonSupertypeType(), sb);
		
		
		
	}

	private void generateStandardList() {
		StringBuilder sb = new StringBuilder();
		printProlog(sb);
//		File template = new File("./templates/ParseqList.java");
//		try {
//			sb.append(Files.toString(template, Charsets.UTF_8));
//		} catch (IOException e) {
//			abort("Could not read template " + template);
//		}
		TemplateParseqList.writeTo(sb);
		createFile("ParseqList", sb);
	}

	private String getCommonSupertypeType() {
		return  toFirstUpper(mainName) + "Element";
	}

	private void printProlog(StringBuilder sb) {
		sb.append(PARSEQ_COMMENT + "\n");
		sb.append("package " + packageName + ";\n\n");
	}
	
	private void removeOldFiles() {
		for (File old : oldFiles) {
			try {
				if (Files.readFirstLine(old, Charsets.UTF_8).startsWith(PARSEQ_COMMENT)) {
					System.out.println("removing file: " + old);
					old.renameTo(new File(old.getAbsolutePath() + ".backup"));
				}
			} catch (IOException e) {
				throw new Error(e);
			}			
		}
	}

	private String toFirstLower(String name) {
		return Character.toLowerCase(name.charAt(0)) + name.substring(1);
	}

	private String toFirstUpper(String name) {
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}

	/**
	 * calculates the transient closure of a multimap 
	 */
	private <T> Multimap<T, T> transientClosure(Multimap<T, T> start) {
		Multimap<T, T> result = HashMultimap.create();
		result.putAll(start);
		
		boolean changed;
		do {
			Multimap<T, T> changes = HashMultimap.create();
			
			for (Entry<T, T> e1 : result.entries()) {
				for (T t : result.get(e1.getValue())) {
					changes.put(e1.getKey(), t);
				}
			}
			changed = result.putAll(changes);
			
		} while (changed);
		
		return result;
	}

}
