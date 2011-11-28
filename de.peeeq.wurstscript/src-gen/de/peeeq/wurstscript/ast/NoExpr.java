//generated by parseq
package de.peeeq.wurstscript.ast;

public interface NoExpr extends AstElement, OptExpr {
	AstElement getParent();
	NoExpr copy();
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(NoExpr.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(LocalVarDef.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(OptExpr.Visitor v);
	public abstract void accept(StmtReturn.Visitor v);
	public interface Visitor {
		void visit(NoExpr noExpr);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(NoExpr noExpr) {}
	}
}
