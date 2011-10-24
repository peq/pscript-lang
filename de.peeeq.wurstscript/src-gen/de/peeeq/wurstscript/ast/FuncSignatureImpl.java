//generated by parseq
package de.peeeq.wurstscript.ast;

class FuncSignatureImpl implements FuncSignature, SortPosIntern {
	FuncSignatureImpl(WPos source, String name, WParameters parameters, OptTypeExpr typ) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)source).setParent(this);
		this.source = source;
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
		if (parameters == null) throw new IllegalArgumentException();
		((SortPosIntern)parameters).setParent(this);
		this.parameters = parameters;
		if (typ == null) throw new IllegalArgumentException();
		((SortPosIntern)typ).setParent(this);
		this.typ = typ;
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

	private String name;
	public void setName(String name) {
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
	} 
	public String getName() { return name; }

	private WParameters parameters;
	public void setParameters(WParameters parameters) {
		if (parameters == null) throw new IllegalArgumentException();
		((SortPosIntern)this.parameters).setParent(null);
		((SortPosIntern)parameters).setParent(this);
		this.parameters = parameters;
	} 
	public WParameters getParameters() { return parameters; }

	private OptTypeExpr typ;
	public void setTyp(OptTypeExpr typ) {
		if (typ == null) throw new IllegalArgumentException();
		((SortPosIntern)this.typ).setParent(null);
		((SortPosIntern)typ).setParent(this);
		this.typ = typ;
	} 
	public OptTypeExpr getTyp() { return typ; }

	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		parameters.accept(v);
		typ.accept(v);
		v.visit(this);
	}
}
