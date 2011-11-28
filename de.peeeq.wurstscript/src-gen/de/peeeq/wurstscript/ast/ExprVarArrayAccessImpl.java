//generated by parseq
package de.peeeq.wurstscript.ast;

class ExprVarArrayAccessImpl implements ExprVarArrayAccess, AstElementIntern {
	ExprVarArrayAccessImpl(WPos source, String varName, Indexes indexes) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		if (varName == null) throw new IllegalArgumentException();
		this.varName = varName;
		if (indexes == null) throw new IllegalArgumentException();
		((AstElementIntern)indexes).setParent(this);
		this.indexes = indexes;
	}

	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)this.source).setParent(null);
		((AstElementIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private String varName;
	public void setVarName(String varName) {
		if (varName == null) throw new IllegalArgumentException();
		this.varName = varName;
	} 
	public String getVarName() { return varName; }

	private Indexes indexes;
	public void setIndexes(Indexes indexes) {
		if (indexes == null) throw new IllegalArgumentException();
		((AstElementIntern)this.indexes).setParent(null);
		((AstElementIntern)indexes).setParent(this);
		this.indexes = indexes;
	} 
	public Indexes getIndexes() { return indexes; }

	public AstElement get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return indexes;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 2;
	}
	public ExprVarArrayAccess copy() {
		return new ExprVarArrayAccessImpl(source.copy(), varName, indexes.copy());
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(OptTypeExpr.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtSet.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(LocalVarDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprMemberArrayVar.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprMemberMethod.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtExitwhen.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(AstElementWithModifier.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(NameRef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(InitBlock.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprAtomic.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtCall.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprNewObject.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassOrModule.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncRef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WParameter.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeRef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(NativeType.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprVarArrayAccess.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(NameDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtDestroy.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprUnary.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(GlobalVarDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(Indexes.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeExpr.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(Expr.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ModuleDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprCast.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprBinary.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(OptExpr.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ArraySizes.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprAssignable.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(WParameters.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtReturn.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprFunctionCall.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(Arguments.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprMemberVar.Visitor v) {
		source.accept(v);
		indexes.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(ExprAssignable.Matcher<T> matcher) {
		return matcher.case_ExprVarArrayAccess(this);
	}
	@Override public void match(ExprAssignable.MatcherVoid matcher) {
		matcher.case_ExprVarArrayAccess(this);
	}

	@Override public <T> T match(OptExpr.Matcher<T> matcher) {
		return matcher.case_ExprVarArrayAccess(this);
	}
	@Override public void match(OptExpr.MatcherVoid matcher) {
		matcher.case_ExprVarArrayAccess(this);
	}

	@Override public <T> T match(ExprAtomic.Matcher<T> matcher) {
		return matcher.case_ExprVarArrayAccess(this);
	}
	@Override public void match(ExprAtomic.MatcherVoid matcher) {
		matcher.case_ExprVarArrayAccess(this);
	}

	@Override public <T> T match(NameRef.Matcher<T> matcher) {
		return matcher.case_ExprVarArrayAccess(this);
	}
	@Override public void match(NameRef.MatcherVoid matcher) {
		matcher.case_ExprVarArrayAccess(this);
	}

	@Override public <T> T match(Expr.Matcher<T> matcher) {
		return matcher.case_ExprVarArrayAccess(this);
	}
	@Override public void match(Expr.MatcherVoid matcher) {
		matcher.case_ExprVarArrayAccess(this);
	}

	@Override public String toString() {
		return "ExprVarArrayAccess(" + source + ", " +varName + ", " +indexes+")";
	}
	private boolean attr_attrTyp_isCached = false;
	private de.peeeq.wurstscript.types.PscriptType attr_attrTyp_cache;
	public de.peeeq.wurstscript.types.PscriptType attrTyp() {
		if (!attr_attrTyp_isCached) {
			attr_attrTyp_cache = de.peeeq.wurstscript.attributes.AttrExprType.calculate(this);
			attr_attrTyp_isCached = true;
		}
		return attr_attrTyp_cache;
	}
	private boolean attr_attrNameDef_isCached = false;
	private NameDef attr_attrNameDef_cache;
	public NameDef attrNameDef() {
		if (!attr_attrNameDef_isCached) {
			attr_attrNameDef_cache = de.peeeq.wurstscript.attributes.AttrNameDef.calculate(this);
			attr_attrNameDef_isCached = true;
		}
		return attr_attrNameDef_cache;
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
	private boolean attr_attrNearestClassOrModule_isCached = false;
	private ClassOrModule attr_attrNearestClassOrModule_cache;
	public ClassOrModule attrNearestClassOrModule() {
		if (!attr_attrNearestClassOrModule_isCached) {
			attr_attrNearestClassOrModule_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.nearestClassOrModule(this);
			attr_attrNearestClassOrModule_isCached = true;
		}
		return attr_attrNearestClassOrModule_cache;
	}
}
