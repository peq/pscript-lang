//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassStmtExitwhenImpl implements JassStmtExitwhen, JassAstElementIntern {
	JassStmtExitwhenImpl(JassExpr cond) {
		if (cond == null) throw new IllegalArgumentException();
		((JassAstElementIntern)cond).setParent(this);
		this.cond = cond;
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private JassExpr cond;
	public void setCond(JassExpr cond) {
		if (cond == null) throw new IllegalArgumentException();
		((JassAstElementIntern)this.cond).setParent(null);
		((JassAstElementIntern)cond).setParent(this);
		this.cond = cond;
	} 
	public JassExpr getCond() { return cond; }

	public JassAstElement get(int i) {
		switch (i) {
			case 0: return cond;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 1;
	}
	public JassStmtExitwhen copy() {
		return new JassStmtExitwhenImpl(cond.copy());
	}
	@Override public void accept(JassStatement.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtExitwhen.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		cond.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(JassStatement.Matcher<T> matcher) {
		return matcher.case_JassStmtExitwhen(this);
	}
	@Override public void match(JassStatement.MatcherVoid matcher) {
		matcher.case_JassStmtExitwhen(this);
	}

	@Override public String toString() {
		return "JassStmtExitwhen(" + cond+")";
	}
}
