//generated by parseq
package de.peeeq.wurstscript.ast;

public interface WStatement extends AstElement{
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_ExprNewObject(ExprNewObject exprNewObject);
		T case_ExprMemberMethod(ExprMemberMethod exprMemberMethod);
		T case_StmtIf(StmtIf stmtIf);
		T case_StmtReturn(StmtReturn stmtReturn);
		T case_StmtLoop(StmtLoop stmtLoop);
		T case_StmtSet(StmtSet stmtSet);
		T case_ExprFunctionCall(ExprFunctionCall exprFunctionCall);
		T case_StmtDestroy(StmtDestroy stmtDestroy);
		T case_StmtErr(StmtErr stmtErr);
		T case_StmtExitwhen(StmtExitwhen stmtExitwhen);
		T case_StmtWhile(StmtWhile stmtWhile);
		T case_LocalVarDef(LocalVarDef localVarDef);
	}

	public interface MatcherVoid {
		void case_ExprNewObject(ExprNewObject exprNewObject);
		void case_ExprMemberMethod(ExprMemberMethod exprMemberMethod);
		void case_StmtIf(StmtIf stmtIf);
		void case_StmtReturn(StmtReturn stmtReturn);
		void case_StmtLoop(StmtLoop stmtLoop);
		void case_StmtSet(StmtSet stmtSet);
		void case_ExprFunctionCall(ExprFunctionCall exprFunctionCall);
		void case_StmtDestroy(StmtDestroy stmtDestroy);
		void case_StmtErr(StmtErr stmtErr);
		void case_StmtExitwhen(StmtExitwhen stmtExitwhen);
		void case_StmtWhile(StmtWhile stmtWhile);
		void case_LocalVarDef(LocalVarDef localVarDef);
	}

	WStatement copy();
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(OpModReal opModReal);
		void visit(OpAssign opAssign);
		void visit(ExprThis exprThis);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprVarAccess exprVarAccess);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ExprCast exprCast);
		void visit(ExprStringVal exprStringVal);
		void visit(OpPlus opPlus);
		void visit(TypeExpr typeExpr);
		void visit(StmtErr stmtErr);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(ArraySizes arraySizes);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(OpUnequals opUnequals);
		void visit(ExprNull exprNull);
		void visit(OpNot opNot);
		void visit(OpDivInt opDivInt);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpEquals opEquals);
		void visit(ExprBoolVal exprBoolVal);
		void visit(WPos wPos);
		void visit(OpOr opOr);
		void visit(OpMult opMult);
		void visit(OpMinus opMinus);
		void visit(StmtSet stmtSet);
		void visit(StmtDestroy stmtDestroy);
		void visit(NoTypeExpr noTypeExpr);
		void visit(OpLessEq opLessEq);
		void visit(Arguments arguments);
		void visit(StmtReturn stmtReturn);
		void visit(ExprBinary exprBinary);
		void visit(ExprUnary exprUnary);
		void visit(NoExpr noExpr);
		void visit(OpDivReal opDivReal);
		void visit(OpAnd opAnd);
		void visit(Indexes indexes);
		void visit(StmtWhile stmtWhile);
		void visit(StmtIf stmtIf);
		void visit(StmtLoop stmtLoop);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprMemberVar exprMemberVar);
		void visit(OpModInt opModInt);
		void visit(LocalVarDef localVarDef);
		void visit(ExprNewObject exprNewObject);
		void visit(OpLess opLess);
		void visit(WStatements wStatements);
		void visit(OpGreaterEq opGreaterEq);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(OpGreater opGreater);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(WStatements wStatements) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(OpGreater opGreater) {}
	}
}
