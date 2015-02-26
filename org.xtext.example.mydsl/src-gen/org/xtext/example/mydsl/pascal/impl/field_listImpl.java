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
import org.xtext.example.mydsl.pascal.field_list;
import org.xtext.example.mydsl.pascal.fixed_part;
import org.xtext.example.mydsl.pascal.variant_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.field_listImpl#getFixedPart <em>Fixed Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.field_listImpl#getVariantPart <em>Variant Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class field_listImpl extends MinimalEObjectImpl.Container implements field_list
{
  /**
   * The cached value of the '{@link #getFixedPart() <em>Fixed Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedPart()
   * @generated
   * @ordered
   */
  protected fixed_part fixedPart;

  /**
   * The cached value of the '{@link #getVariantPart() <em>Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariantPart()
   * @generated
   * @ordered
   */
  protected variant_part variantPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected field_listImpl()
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
    return PascalPackage.Literals.FIELD_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fixed_part getFixedPart()
  {
    return fixedPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFixedPart(fixed_part newFixedPart, NotificationChain msgs)
  {
    fixed_part oldFixedPart = fixedPart;
    fixedPart = newFixedPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED_PART, oldFixedPart, newFixedPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixedPart(fixed_part newFixedPart)
  {
    if (newFixedPart != fixedPart)
    {
      NotificationChain msgs = null;
      if (fixedPart != null)
        msgs = ((InternalEObject)fixedPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED_PART, null, msgs);
      if (newFixedPart != null)
        msgs = ((InternalEObject)newFixedPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__FIXED_PART, null, msgs);
      msgs = basicSetFixedPart(newFixedPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__FIXED_PART, newFixedPart, newFixedPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variant_part getVariantPart()
  {
    return variantPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariantPart(variant_part newVariantPart, NotificationChain msgs)
  {
    variant_part oldVariantPart = variantPart;
    variantPart = newVariantPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__VARIANT_PART, oldVariantPart, newVariantPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariantPart(variant_part newVariantPart)
  {
    if (newVariantPart != variantPart)
    {
      NotificationChain msgs = null;
      if (variantPart != null)
        msgs = ((InternalEObject)variantPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__VARIANT_PART, null, msgs);
      if (newVariantPart != null)
        msgs = ((InternalEObject)newVariantPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FIELD_LIST__VARIANT_PART, null, msgs);
      msgs = basicSetVariantPart(newVariantPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FIELD_LIST__VARIANT_PART, newVariantPart, newVariantPart));
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return basicSetFixedPart(null, msgs);
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return basicSetVariantPart(null, msgs);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return getFixedPart();
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return getVariantPart();
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        setFixedPart((fixed_part)newValue);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        setVariantPart((variant_part)newValue);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        setFixedPart((fixed_part)null);
        return;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        setVariantPart((variant_part)null);
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
      case PascalPackage.FIELD_LIST__FIXED_PART:
        return fixedPart != null;
      case PascalPackage.FIELD_LIST__VARIANT_PART:
        return variantPart != null;
    }
    return super.eIsSet(featureID);
  }

} //field_listImpl
