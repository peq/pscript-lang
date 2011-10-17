/**
 * <copyright>
 * </copyright>
 *

 */
package de.peeeq.pscript.pscript.impl;

import de.peeeq.pscript.pscript.ClassDef;
import de.peeeq.pscript.pscript.ClassSlots;
import de.peeeq.pscript.pscript.PscriptPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.peeeq.pscript.pscript.impl.ClassDefImpl#isUnmanaged <em>Unmanaged</em>}</li>
 *   <li>{@link de.peeeq.pscript.pscript.impl.ClassDefImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefImpl extends TypeDefImpl implements ClassDef
{
  /**
   * The default value of the '{@link #isUnmanaged() <em>Unmanaged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnmanaged()
   * @generated
   * @ordered
   */
  protected static final boolean UNMANAGED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnmanaged() <em>Unmanaged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnmanaged()
   * @generated
   * @ordered
   */
  protected boolean unmanaged = UNMANAGED_EDEFAULT;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<ClassSlots> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDefImpl()
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
    return PscriptPackage.Literals.CLASS_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnmanaged()
  {
    return unmanaged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnmanaged(boolean newUnmanaged)
  {
    boolean oldUnmanaged = unmanaged;
    unmanaged = newUnmanaged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PscriptPackage.CLASS_DEF__UNMANAGED, oldUnmanaged, unmanaged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassSlots> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<ClassSlots>(ClassSlots.class, this, PscriptPackage.CLASS_DEF__MEMBERS);
    }
    return members;
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
      case PscriptPackage.CLASS_DEF__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case PscriptPackage.CLASS_DEF__UNMANAGED:
        return isUnmanaged();
      case PscriptPackage.CLASS_DEF__MEMBERS:
        return getMembers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PscriptPackage.CLASS_DEF__UNMANAGED:
        setUnmanaged((Boolean)newValue);
        return;
      case PscriptPackage.CLASS_DEF__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends ClassSlots>)newValue);
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
      case PscriptPackage.CLASS_DEF__UNMANAGED:
        setUnmanaged(UNMANAGED_EDEFAULT);
        return;
      case PscriptPackage.CLASS_DEF__MEMBERS:
        getMembers().clear();
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
      case PscriptPackage.CLASS_DEF__UNMANAGED:
        return unmanaged != UNMANAGED_EDEFAULT;
      case PscriptPackage.CLASS_DEF__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (unmanaged: ");
    result.append(unmanaged);
    result.append(')');
    return result.toString();
  }

} //ClassDefImpl
