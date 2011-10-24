//generated by parseq
package de.peeeq.wurstscript.ast;

class InitBlockImpl implements InitBlock, SortPosIntern {
	InitBlockImpl(WPos source, WStatements body) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)source).setParent(this);
		this.source = source;
		if (body == null) throw new IllegalArgumentException();
		((SortPosIntern)body).setParent(this);
		this.body = body;
	}

	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)this.source).setParent(null);
		((SortPosIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private WStatements body;
	public void setBody(WStatements body) {
		if (body == null) throw new IllegalArgumentException();
		((SortPosIntern)this.body).setParent(null);
		((SortPosIntern)body).setParent(this);
		this.body = body;
	} 
	public WStatements getBody() { return body; }

	public SortPos get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return body;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 2;
	}
	public InitBlock copy() {
		return new InitBlockImpl(source.copy(), body.copy());
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(InitBlock.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(WScope.Matcher<T> matcher) {
		return matcher.case_InitBlock(this);
	}
	@Override public void match(WScope.MatcherVoid matcher) {
		matcher.case_InitBlock(this);
	}

	@Override public <T> T match(WEntity.Matcher<T> matcher) {
		return matcher.case_InitBlock(this);
	}
	@Override public void match(WEntity.MatcherVoid matcher) {
		matcher.case_InitBlock(this);
	}

}
