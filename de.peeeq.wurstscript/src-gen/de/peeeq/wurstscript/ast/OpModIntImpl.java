//generated by parseq
package de.peeeq.wurstscript.ast;

class OpModIntImpl implements OpModInt, SortPosIntern {
	OpModIntImpl() {
	}

	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { throw new Error("Parent already set."); }
		this.parent = parent;
	}

	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OptTypeExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TypeRef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprVarArrayAccess.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprAtomic.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtExitwhen.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Op.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ArraySizes.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WParameters.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtDestroy.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OptExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtDecRefCount.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Expr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprCast.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtIncRefCount.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(NativeType.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprMemberVar.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprMemberArrayVar.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtReturn.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(VarRef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprAssignable.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprFunctionCall.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OpModInt.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TypeExpr.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprMemberMethod.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FuncRef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(OpBinary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprBinary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Indexes.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprUnary.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WParameter.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(GlobalVarDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtSet.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(Arguments.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(LocalVarDef.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(InitBlock.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(StmtCall.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(ExprNewObject.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		v.visit(this);
	}
	@Override public <T> T match(Op.Matcher<T> matcher) {
		return matcher.case_OpModInt(this);
	}
	@Override public void match(Op.MatcherVoid matcher) {
		matcher.case_OpModInt(this);
	}

	@Override public <T> T match(OpBinary.Matcher<T> matcher) {
		return matcher.case_OpModInt(this);
	}
	@Override public void match(OpBinary.MatcherVoid matcher) {
		matcher.case_OpModInt(this);
	}

}
