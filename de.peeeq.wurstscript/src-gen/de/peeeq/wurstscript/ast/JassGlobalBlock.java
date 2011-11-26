//generated by parseq
package de.peeeq.wurstscript.ast;

public abstract class JassGlobalBlock extends ParseqList<GlobalVarDef> implements AstElement, JassToplevelDeclaration{
	public JassGlobalBlock copy() {
		JassGlobalBlock result = new JassGlobalBlockImpl();
		for (GlobalVarDef elem : this) {
			result.add(elem.copy());
		}
		return result;
	}
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpEquals opEquals);
		void visit(ExprUnary exprUnary);
		void visit(JassGlobalBlock jassGlobalBlock);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(OpUnequals opUnequals);
		void visit(OpNot opNot);
		void visit(OpMinus opMinus);
		void visit(ExprBoolVal exprBoolVal);
		void visit(Modifiers modifiers);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(VisibilityDefault visibilityDefault);
		void visit(ModStatic modStatic);
		void visit(Arguments arguments);
		void visit(OpModReal opModReal);
		void visit(OpModInt opModInt);
		void visit(NoExpr noExpr);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(ExprBinary exprBinary);
		void visit(ExprNull exprNull);
		void visit(ExprStringVal exprStringVal);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprFuncRef exprFuncRef);
		void visit(Indexes indexes);
		void visit(VisibilityPublic visibilityPublic);
		void visit(OpDivReal opDivReal);
		void visit(GlobalVarDef globalVarDef);
		void visit(WPos wPos);
		void visit(ExprVarAccess exprVarAccess);
		void visit(OpGreaterEq opGreaterEq);
		void visit(VisibilityProtected visibilityProtected);
		void visit(ExprMemberVar exprMemberVar);
		void visit(ExprNewObject exprNewObject);
		void visit(NoTypeExpr noTypeExpr);
		void visit(OpMult opMult);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprCast exprCast);
		void visit(TypeExpr typeExpr);
		void visit(ModOverride modOverride);
		void visit(ExprThis exprThis);
		void visit(OpDivInt opDivInt);
		void visit(OpAnd opAnd);
		void visit(OpLessEq opLessEq);
		void visit(OpPlus opPlus);
		void visit(OpOr opOr);
		void visit(OpLess opLess);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(ArraySizes arraySizes);
		void visit(OpGreater opGreater);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(JassGlobalBlock jassGlobalBlock) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(Modifiers modifiers) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(ModStatic modStatic) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(GlobalVarDef globalVarDef) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(ModOverride modOverride) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(OpGreater opGreater) {}
	}
}
