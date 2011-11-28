//generated by parseq
package de.peeeq.wurstscript.jassAst;

public interface JassSimpleVar extends JassAstElement, JassVar {
	JassAstElement getParent();
	void setType(String type);
	String getType();
	void setName(String name);
	String getName();
	JassSimpleVar copy();
	public abstract void accept(JassSimpleVars.Visitor v);
	public abstract void accept(JassVar.Visitor v);
	public abstract void accept(JassVars.Visitor v);
	public abstract void accept(JassFunctions.Visitor v);
	public abstract void accept(JassFunction.Visitor v);
	public abstract void accept(JassProg.Visitor v);
	public abstract void accept(JassSimpleVar.Visitor v);
	public interface Visitor {
		void visit(JassSimpleVar jassSimpleVar);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(JassSimpleVar jassSimpleVar) {}
	}
}
