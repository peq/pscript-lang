//generated by parseq
package de.peeeq.wurstscript.jassAst;

public interface JassStmtReturnVoid extends JassAstElement, JassStatement {
	JassAstElement getParent();
	JassStmtReturnVoid copy();
	public abstract void accept(JassStatement.Visitor v);
	public abstract void accept(JassStmtReturnVoid.Visitor v);
	public abstract void accept(JassFunction.Visitor v);
	public abstract void accept(JassStmtIf.Visitor v);
	public abstract void accept(JassStatements.Visitor v);
	public abstract void accept(JassStmtLoop.Visitor v);
	public abstract void accept(JassProg.Visitor v);
	public abstract void accept(JassFunctions.Visitor v);
	public interface Visitor {
		void visit(JassStmtReturnVoid jassStmtReturnVoid);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(JassStmtReturnVoid jassStmtReturnVoid) {}
	}
}
