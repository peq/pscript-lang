/**
 * <copyright>
 * </copyright>
 *

 */
package de.peeeq.pscript.pscript.impl;

import de.peeeq.pscript.pscript.ExprFunctioncall;
import de.peeeq.pscript.pscript.ExprList;
import de.peeeq.pscript.pscript.PscriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Functioncall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.peeeq.pscript.pscript.impl.ExprFunctioncallImpl#getNameVal <em>Name Val</em>}</li>
 *   <li>{@link de.peeeq.pscript.pscript.impl.ExprFunctioncallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprFunctioncallImpl extends ExprImpl implements ExprFunctioncall
{
  /**
   * The default value of the '{@link #getNameVal() <em>Name Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVal()
   * @generated
   * @ordered
   */
  protected static final String NAME_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameVal() <em>Name Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameVal()
   * @generated
   * @ordered
   */
  protected String nameVal = NAME_VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ExprList parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprFunctioncallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PscriptPackage.Literals.EXPR_FUNCTIONCALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameVal()
  {
    return nameVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameVal(String newNameVal)
  {
    String oldNameVal = nameVal;
    nameVal = newNameVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PscriptPackage.EXPR_FUNCTIONCALL__NAME_VAL, oldNameVal, nameVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprList getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(ExprList newParameters, NotificationChain msgs)
  {
    ExprList oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(ExprList newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS:
        return basicSetParameters(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PscriptPackage.EXPR_FUNCTIONCALL__NAME_VAL:
        return getNameVal();
      case PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PscriptPackage.EXPR_FUNCTIONCALL__NAME_VAL:
        setNameVal((String)newValue);
        return;
      case PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS:
        setParameters((ExprList)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PscriptPackage.EXPR_FUNCTIONCALL__NAME_VAL:
        setNameVal(NAME_VAL_EDEFAULT);
        return;
      case PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS:
        setParameters((ExprList)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PscriptPackage.EXPR_FUNCTIONCALL__NAME_VAL:
        return NAME_VAL_EDEFAULT == null ? nameVal != null : !NAME_VAL_EDEFAULT.equals(nameVal);
      case PscriptPackage.EXPR_FUNCTIONCALL__PARAMETERS:
        return parameters != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nameVal: ");
    result.append(nameVal);
    result.append(')');
    return result.toString();
  }

} //ExprFunctioncallImpl
