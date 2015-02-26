/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.constant;
import org.xtext.example.mydsl.pascal.subrange_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>subrange type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.subrange_typeImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.subrange_typeImpl#getConstant2 <em>Constant2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class subrange_typeImpl extends MinimalEObjectImpl.Container implements subrange_type
{
  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected constant constant;

  /**
   * The cached value of the '{@link #getConstant2() <em>Constant2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant2()
   * @generated
   * @ordered
   */
  protected constant constant2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected subrange_typeImpl()
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
    return PascalPackage.Literals.SUBRANGE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(constant newConstant, NotificationChain msgs)
  {
    constant oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(constant newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant getConstant2()
  {
    return constant2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant2(constant newConstant2, NotificationChain msgs)
  {
    constant oldConstant2 = constant2;
    constant2 = newConstant2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__CONSTANT2, oldConstant2, newConstant2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant2(constant newConstant2)
  {
    if (newConstant2 != constant2)
    {
      NotificationChain msgs = null;
      if (constant2 != null)
        msgs = ((InternalEObject)constant2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__CONSTANT2, null, msgs);
      if (newConstant2 != null)
        msgs = ((InternalEObject)newConstant2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SUBRANGE_TYPE__CONSTANT2, null, msgs);
      msgs = basicSetConstant2(newConstant2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SUBRANGE_TYPE__CONSTANT2, newConstant2, newConstant2));
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
      case PascalPackage.SUBRANGE_TYPE__CONSTANT:
        return basicSetConstant(null, msgs);
      case PascalPackage.SUBRANGE_TYPE__CONSTANT2:
        return basicSetConstant2(null, msgs);
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
      case PascalPackage.SUBRANGE_TYPE__CONSTANT:
        return getConstant();
      case PascalPackage.SUBRANGE_TYPE__CONSTANT2:
        return getConstant2();
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
      case PascalPackage.SUBRANGE_TYPE__CONSTANT:
        setConstant((constant)newValue);
        return;
      case PascalPackage.SUBRANGE_TYPE__CONSTANT2:
        setConstant2((constant)newValue);
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
      case PascalPackage.SUBRANGE_TYPE__CONSTANT:
        setConstant((constant)null);
        return;
      case PascalPackage.SUBRANGE_TYPE__CONSTANT2:
        setConstant2((constant)null);
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
      case PascalPackage.SUBRANGE_TYPE__CONSTANT:
        return constant != null;
      case PascalPackage.SUBRANGE_TYPE__CONSTANT2:
        return constant2 != null;
    }
    return super.eIsSet(featureID);
  }

} //subrange_typeImpl
