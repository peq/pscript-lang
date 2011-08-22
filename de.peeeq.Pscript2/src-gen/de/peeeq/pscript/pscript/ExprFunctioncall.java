/**
 * <copyright>
 * </copyright>
 *

 */
package de.peeeq.pscript.pscript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Functioncall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.peeeq.pscript.pscript.ExprFunctioncall#getNameVal <em>Name Val</em>}</li>
 *   <li>{@link de.peeeq.pscript.pscript.ExprFunctioncall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.peeeq.pscript.pscript.PscriptPackage#getExprFunctioncall()
 * @model
 * @generated
 */
public interface ExprFunctioncall extends Expr
{
  /**
   * Returns the value of the '<em><b>Name Val</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Val</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Val</em>' reference.
   * @see #setNameVal(FuncDef)
   * @see de.peeeq.pscript.pscript.PscriptPackage#getExprFunctioncall_NameVal()
   * @model
   * @generated
   */
  FuncDef getNameVal();

  /**
   * Sets the value of the '{@link de.peeeq.pscript.pscript.ExprFunctioncall#getNameVal <em>Name Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Val</em>' reference.
   * @see #getNameVal()
   * @generated
   */
  void setNameVal(FuncDef value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link de.peeeq.pscript.pscript.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see de.peeeq.pscript.pscript.PscriptPackage#getExprFunctioncall_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getParams();

} // ExprFunctioncall
