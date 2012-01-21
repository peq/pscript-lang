package de.peeeq.wurstscript.attributes;

import java.util.List;

import com.google.common.collect.Lists;

import de.peeeq.wurstscript.ast.ClassDef;
import de.peeeq.wurstscript.ast.CompilationUnit;
import de.peeeq.wurstscript.ast.InstanceDef;

public class GetByType {

	public static class ByTypes {
		public final List<ClassDef> classes = Lists.newArrayList();
		public final List<InstanceDef> instanceDefs = Lists.newArrayList();
	}
	
	public static ByTypes calculate(CompilationUnit cu) {
		final ByTypes result = new ByTypes();
		cu.accept(new CompilationUnit.DefaultVisitor() {
			
			@Override
			public void visit(ClassDef classDef) {
				result.classes.add(classDef);
			}
			
			@Override
			public void visit(InstanceDef instanceDef) {
				result.instanceDefs.add(instanceDef);
			}
			
		});
		
		return result;
	}

}
