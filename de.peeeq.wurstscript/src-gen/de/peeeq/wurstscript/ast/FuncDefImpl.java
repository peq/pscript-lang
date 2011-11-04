//generated by parseq
package de.peeeq.wurstscript.ast;

class FuncDefImpl implements FuncDef, AstElementIntern {
	FuncDefImpl(WPos source, VisibilityModifier visibility, FuncSignature signature, WStatements body) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		if (visibility == null) throw new IllegalArgumentException();
		((AstElementIntern)visibility).setParent(this);
		this.visibility = visibility;
		if (signature == null) throw new IllegalArgumentException();
		((AstElementIntern)signature).setParent(this);
		this.signature = signature;
		if (body == null) throw new IllegalArgumentException();
		((AstElementIntern)body).setParent(this);
		this.body = body;
	}

	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)this.source).setParent(null);
		((AstElementIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private VisibilityModifier visibility;
	public void setVisibility(VisibilityModifier visibility) {
		if (visibility == null) throw new IllegalArgumentException();
		((AstElementIntern)this.visibility).setParent(null);
		((AstElementIntern)visibility).setParent(this);
		this.visibility = visibility;
	} 
	public VisibilityModifier getVisibility() { return visibility; }

	private FuncSignature signature;
	public void setSignature(FuncSignature signature) {
		if (signature == null) throw new IllegalArgumentException();
		((AstElementIntern)this.signature).setParent(null);
		((AstElementIntern)signature).setParent(this);
		this.signature = signature;
	} 
	public FuncSignature getSignature() { return signature; }

	private WStatements body;
	public void setBody(WStatements body) {
		if (body == null) throw new IllegalArgumentException();
		((AstElementIntern)this.body).setParent(null);
		((AstElementIntern)body).setParent(this);
		this.body = body;
	} 
	public WStatements getBody() { return body; }

	public AstElement get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return visibility;
			case 2: return signature;
			case 3: return body;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 4;
	}
	public FuncDef copy() {
		return new FuncDefImpl(source.copy(), visibility.copy(), signature.copy(), body.copy());
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		visibility.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(WEntity.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(WEntity.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(TopLevelDeclaration.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(TopLevelDeclaration.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(JassToplevelDeclaration.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(JassToplevelDeclaration.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(ClassSlot.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(ClassSlot.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(ClassMember.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(ClassMember.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(FunctionDefinition.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(FunctionDefinition.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(WScope.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(WScope.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public String toString() {
		return "FuncDef(" + source + ", " +visibility + ", " +signature + ", " +body+")";
	}
	private boolean attr_attrScopeVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopeVariables_cache;
	public java.util.Map<String, VarDef> attrScopeVariables() {
		if (!attr_attrScopeVariables_isCached) {
			attr_attrScopeVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculate(this);
			attr_attrScopeVariables_isCached = true;
		}
		return attr_attrScopeVariables_cache;
	}
	private boolean attr_attrScopePackageVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePackageVariables_cache;
	public java.util.Map<String, VarDef> attrScopePackageVariables() {
		if (!attr_attrScopePackageVariables_isCached) {
			attr_attrScopePackageVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePackage(this);
			attr_attrScopePackageVariables_isCached = true;
		}
		return attr_attrScopePackageVariables_cache;
	}
	private boolean attr_attrScopePublicVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePublicVariables_cache;
	public java.util.Map<String, VarDef> attrScopePublicVariables() {
		if (!attr_attrScopePublicVariables_isCached) {
			attr_attrScopePublicVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePublic(this);
			attr_attrScopePublicVariables_isCached = true;
		}
		return attr_attrScopePublicVariables_cache;
	}
	private boolean attr_attrScopePublicReadVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePublicReadVariables_cache;
	public java.util.Map<String, VarDef> attrScopePublicReadVariables() {
		if (!attr_attrScopePublicReadVariables_isCached) {
			attr_attrScopePublicReadVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePublicRead(this);
			attr_attrScopePublicReadVariables_isCached = true;
		}
		return attr_attrScopePublicReadVariables_cache;
	}
	private boolean attr_attrScopeFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopeFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopeFunctions() {
		if (!attr_attrScopeFunctions_isCached) {
			attr_attrScopeFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculate(this);
			attr_attrScopeFunctions_isCached = true;
		}
		return attr_attrScopeFunctions_cache;
	}
	private boolean attr_attrScopePackageFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopePackageFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopePackageFunctions() {
		if (!attr_attrScopePackageFunctions_isCached) {
			attr_attrScopePackageFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePackage(this);
			attr_attrScopePackageFunctions_isCached = true;
		}
		return attr_attrScopePackageFunctions_cache;
	}
	private boolean attr_attrScopePublicFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopePublicFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopePublicFunctions() {
		if (!attr_attrScopePublicFunctions_isCached) {
			attr_attrScopePublicFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePublic(this);
			attr_attrScopePublicFunctions_isCached = true;
		}
		return attr_attrScopePublicFunctions_cache;
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
}
