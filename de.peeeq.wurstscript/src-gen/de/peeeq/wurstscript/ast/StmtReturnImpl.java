//generated by parseq
package de.peeeq.wurstscript.ast;

class StmtReturnImpl implements StmtReturn, SortPosIntern {
	StmtReturnImpl(WPos source, OptExpr obj) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)source).setParent(this);
		this.source = source;
		if (obj == null) throw new IllegalArgumentException();
		((SortPosIntern)obj).setParent(this);
		this.obj = obj;
	}

	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { throw new Error("Parent already set."); }
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

	private OptExpr obj;
	public void setObj(OptExpr obj) {
		if (obj == null) throw new IllegalArgumentException();
		((SortPosIntern)this.obj).setParent(null);
		((SortPosIntern)obj).setParent(this);
		this.obj = obj;
	} 
	public OptExpr getObj() { return obj; }

	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtReturn.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(InitBlock.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		obj.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(WStatement.Matcher<T> matcher) {
		return matcher.case_StmtReturn(this);
	}
	@Override public void match(WStatement.MatcherVoid matcher) {
		matcher.case_StmtReturn(this);
	}

}
