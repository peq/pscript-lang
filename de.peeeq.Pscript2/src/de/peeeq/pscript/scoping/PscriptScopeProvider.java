/*
 * generated by Xtext
 */
package de.peeeq.pscript.scoping;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.inject.Inject;

import de.peeeq.pscript.PUtil.PUtil;
import de.peeeq.pscript.attributes.AttrExprType;
import de.peeeq.pscript.attributes.infrastructure.AttributeManager;
import de.peeeq.pscript.pscript.Expr;
import de.peeeq.pscript.pscript.ExprFunctioncall;
import de.peeeq.pscript.pscript.ExprMember;
import de.peeeq.pscript.types.PscriptType;
import de.peeeq.pscript.utils.NotNullList;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class PscriptScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject
	AttributeManager attributeManager;
	
	
	public IScope scope_FuncDef(EObject context, EReference ref) {
		IScope scope = delegateGetScope(context, ref);
		boolean complete = false; // complete == do we know all types (the whole function call expression) ?
		PscriptType[] paramTypes = new PscriptType[0];
		
		
		if (context instanceof ExprMember) {
			// if the context is ExprMember we know at least the type of the leftMost Parameter
			ExprMember m = (ExprMember) context;
			PscriptType leftType = attributeManager.getAttValue(AttrExprType.class, m.getLeft());
			paramTypes = PUtil.arrayOf(leftType);
		}
		
		if (context instanceof ExprFunctioncall) {
			complete = true; // we have the whole call
			
			ExprFunctioncall fc = (ExprFunctioncall) context;
			List<Expr> arguments = fc.getParameters().getParams();
	
			if (context.eContainer() instanceof ExprMember) {
				ExprMember exprMember = (ExprMember) context.eContainer();
				if (exprMember.getRight() == fc) {
					// function call is right side of member expression
					LinkedList<Expr> arguments2 = new NotNullList<Expr>();
					arguments2.add(exprMember.getLeft());
					arguments2.addAll(arguments);
	
					arguments = arguments2;
				}
			}


			paramTypes = new PscriptType[arguments.size()];
			int i = 0;
			for (Expr a : arguments) {
				paramTypes[i] = attributeManager.getAttValue(AttrExprType.class, a);
				i++;
			}
		}		
		
		return new FunctionScope(attributeManager, scope, complete, paramTypes);
	}
	
//	public IScope scope_FuncDef(EObject context, EReference ref) {
//		List<FuncDef> scope = new LinkedList<FuncDef>();
//		
//		EObject context2 = context;
//		while (context2 != null) {
//			System.out.println("	Context2 = " + context2);
//			
//			for (EObject elem : context2.eContents()) {
//				System.out.println("		elem = " + elem);
//				if (elem instanceof FuncDef) {
//					scope.add((FuncDef) elem);
//				}
//			}
//			
//			// onve level down:
//			context2 = context2.eContainer();
//		}
//		
//		if (context instanceof ExprMember) {
//			ExprMember m = (ExprMember) context;
//			PscriptType leftType = attributeManager.getAttValue(AttrExprType.class, m.getLeft());
//			if (leftType != null) {
//				
//				List<FuncDef> filteredScope = new LinkedList<FuncDef>();
//				for (FuncDef f : scope) {
//					if (f.getParameters().size() > 0) {
//						ParameterDef firstParam = (ParameterDef) f.getParameters().get(0);
//						PscriptType firstParamType = attributeManager.getAttValue(AttrTypeExprType.class, firstParam.getType());
//						if (firstParamType.isSupertypeOf(leftType)) {
//							filteredScope.add(f);
//						}
//					}
//				}
//				
//				if (filteredScope.size() > 0) {
//					scope = filteredScope;
//				}
//				
//				
//			}
//		}
//		
//		if (context instanceof ExprFunctioncall) {
//			ExprFunctioncall fc = (ExprFunctioncall) context;
//			List<Expr> arguments = fc.getParameters().getParams();
//			
//			if (context.eContainer() instanceof ExprMember) {
//				ExprMember exprMember = (ExprMember) context.eContainer();
//				
//				LinkedList<Expr> arguments2 = new LinkedList<Expr>();
//				arguments2.add(exprMember.getLeft());
//				arguments2.addAll(arguments);
//				
//				arguments = arguments2;
//			}
//			
//			
//			List<PscriptType> argumentTypes = new LinkedList<PscriptType>();
//			for (Expr a : arguments) {
//				argumentTypes.add(attributeManager.getAttValue(AttrExprType.class, a));
//			}
//			
//			List<FuncDef> filteredScope = new LinkedList<FuncDef>();
//			for (FuncDef f : scope) {
//				// check number of parameters:
//				if (f.getParameters().size() == argumentTypes.size()) {
//					boolean parametersMatch = true;
//					for (int i=0; i < argumentTypes.size(); i++) {
//						ParameterDef param = (ParameterDef) f.getParameters().get(i);
//						PscriptType paramType = attributeManager.getAttValue(AttrTypeExprType.class, param.getType());
//						if (!argumentTypes.get(i).isSubtypeOf(paramType)) {
//							parametersMatch = false;
//							break;		
//						}
//					}
//					if (parametersMatch) {
//						filteredScope.add(f);
//					}
//				}
//			}
//			
//			// if we filtered out all function it is better to keep the old (wrong) scope
//			// to give better error messages later
//			if (filteredScope.size() > 0) {
//				scope = filteredScope;
//			}
//		}
//		
//		
//		IScope result = Scopes.scopeFor(scope);
//		return result;
//	}
	
}
