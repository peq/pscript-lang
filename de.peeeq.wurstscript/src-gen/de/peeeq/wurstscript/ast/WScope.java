//generated by parseq
package de.peeeq.wurstscript.ast;

public interface WScope extends AstElement{
	AstElement getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_CompilationUnit(CompilationUnit compilationUnit);
		T case_ConstructorDef(ConstructorDef constructorDef);
		T case_FuncDef(FuncDef funcDef);
		T case_OnDestroyDef(OnDestroyDef onDestroyDef);
		T case_InitBlock(InitBlock initBlock);
		T case_WPackage(WPackage wPackage);
		T case_ModuleDef(ModuleDef moduleDef);
		T case_ClassDef(ClassDef classDef);
	}

	public interface MatcherVoid {
		void case_CompilationUnit(CompilationUnit compilationUnit);
		void case_ConstructorDef(ConstructorDef constructorDef);
		void case_FuncDef(FuncDef funcDef);
		void case_OnDestroyDef(OnDestroyDef onDestroyDef);
		void case_InitBlock(InitBlock initBlock);
		void case_WPackage(WPackage wPackage);
		void case_ModuleDef(ModuleDef moduleDef);
		void case_ClassDef(ClassDef classDef);
	}

	WScope copy();
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(JassGlobalBlock jassGlobalBlock);
		void visit(WParameter wParameter);
		void visit(WImport wImport);
		void visit(OnDestroyDef onDestroyDef);
		void visit(NativeFunc nativeFunc);
		void visit(OpNot opNot);
		void visit(ExprBoolVal exprBoolVal);
		void visit(Modifiers modifiers);
		void visit(ModuleUse moduleUse);
		void visit(StmtReturn stmtReturn);
		void visit(OpAssign opAssign);
		void visit(LocalVarDef localVarDef);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(VisibilityDefault visibilityDefault);
		void visit(ModStatic modStatic);
		void visit(OpModReal opModReal);
		void visit(ClassDef classDef);
		void visit(OpModInt opModInt);
		void visit(NoExpr noExpr);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(WPackage wPackage);
		void visit(ExprBinary exprBinary);
		void visit(ExprNull exprNull);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(StmtErr stmtErr);
		void visit(Indexes indexes);
		void visit(VisibilityPublic visibilityPublic);
		void visit(OpDivReal opDivReal);
		void visit(ExprVarAccess exprVarAccess);
		void visit(VisibilityProtected visibilityProtected);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpMult opMult);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprCast exprCast);
		void visit(ModOverride modOverride);
		void visit(TypeExpr typeExpr);
		void visit(ExprThis exprThis);
		void visit(OpDivInt opDivInt);
		void visit(OpAnd opAnd);
		void visit(OpLessEq opLessEq);
		void visit(NativeType nativeType);
		void visit(OpEquals opEquals);
		void visit(ExprUnary exprUnary);
		void visit(WStatements wStatements);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(OpUnequals opUnequals);
		void visit(OpMinus opMinus);
		void visit(Arguments arguments);
		void visit(ConstructorDef constructorDef);
		void visit(StmtWhile stmtWhile);
		void visit(ExprStringVal exprStringVal);
		void visit(ExprFuncRef exprFuncRef);
		void visit(WParameters wParameters);
		void visit(WEntities wEntities);
		void visit(GlobalVarDef globalVarDef);
		void visit(WPos wPos);
		void visit(StmtSet stmtSet);
		void visit(ModuleDef moduleDef);
		void visit(ExprMemberVar exprMemberVar);
		void visit(ExprNewObject exprNewObject);
		void visit(NoTypeExpr noTypeExpr);
		void visit(InitBlock initBlock);
		void visit(StmtLoop stmtLoop);
		void visit(CompilationUnit compilationUnit);
		void visit(ClassSlots classSlots);
		void visit(FuncDef funcDef);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(FuncSignature funcSignature);
		void visit(StmtIf stmtIf);
		void visit(OpPlus opPlus);
		void visit(StmtDestroy stmtDestroy);
		void visit(OpOr opOr);
		void visit(OpLess opLess);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(ArraySizes arraySizes);
		void visit(OpGreater opGreater);
		void visit(WImports wImports);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(JassGlobalBlock jassGlobalBlock) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(WImport wImport) {}
		@Override public void visit(OnDestroyDef onDestroyDef) {}
		@Override public void visit(NativeFunc nativeFunc) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(Modifiers modifiers) {}
		@Override public void visit(ModuleUse moduleUse) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(ModStatic modStatic) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(ClassDef classDef) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(WPackage wPackage) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(ModOverride modOverride) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(NativeType nativeType) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(WStatements wStatements) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(ConstructorDef constructorDef) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(WParameters wParameters) {}
		@Override public void visit(WEntities wEntities) {}
		@Override public void visit(GlobalVarDef globalVarDef) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(ModuleDef moduleDef) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(InitBlock initBlock) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(CompilationUnit compilationUnit) {}
		@Override public void visit(ClassSlots classSlots) {}
		@Override public void visit(FuncDef funcDef) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(FuncSignature funcSignature) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(WImports wImports) {}
	}
	public abstract java.util.Map<String, NameDef> attrScopeNames();
	public abstract java.util.Map<String, NameDef> attrScopePackageNames();
	public abstract java.util.Map<String, NameDef> attrScopePublicNames();
	public abstract java.util.Map<String, NameDef> attrScopePublicReadNamess();
	public abstract com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopeFunctions();
	public abstract com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopePackageFunctions();
	public abstract com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopePublicFunctions();
}
