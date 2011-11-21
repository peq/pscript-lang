//generated by parseq
package de.peeeq.wurstscript.ast;

public interface ModuleUse extends AstElement, ClassSlot {
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	void setModuleName(String moduleName);
	String getModuleName();
	ModuleUse copy();
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(ModuleUse.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(WPos wPos);
		void visit(ModuleUse moduleUse);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(WPos wPos) {}
		@Override public void visit(ModuleUse moduleUse) {}
	}
	public abstract ModuleDef attrModuleDef();
}
