/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.bound_specification;
import org.xtext.example.mydsl.pascal.packed_conformant_array_schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>packed conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.packed_conformant_array_schemaImpl#getBoundSpecification <em>Bound Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class packed_conformant_array_schemaImpl extends conformant_array_schemaImpl implements packed_conformant_array_schema
{
  /**
   * The cached value of the '{@link #getBoundSpecification() <em>Bound Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoundSpecification()
   * @generated
   * @ordered
   */
  protected bound_specification boundSpecification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected packed_conformant_array_schemaImpl()
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
    return PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bound_specification getBoundSpecification()
  {
    return boundSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoundSpecification(bound_specification newBoundSpecification, NotificationChain msgs)
  {
    bound_specification oldBoundSpecification = boundSpecification;
    boundSpecification = newBoundSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, oldBoundSpecification, newBoundSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoundSpecification(bound_specification newBoundSpecification)
  {
    if (newBoundSpecification != boundSpecification)
    {
      NotificationChain msgs = null;
      if (boundSpecification != null)
        msgs = ((InternalEObject)boundSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, null, msgs);
      if (newBoundSpecification != null)
        msgs = ((InternalEObject)newBoundSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, null, msgs);
      msgs = basicSetBoundSpecification(newBoundSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION, newBoundSpecification, newBoundSpecification));
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return basicSetBoundSpecification(null, msgs);
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return getBoundSpecification();
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        setBoundSpecification((bound_specification)newValue);
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        setBoundSpecification((bound_specification)null);
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
      case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATION:
        return boundSpecification != null;
    }
    return super.eIsSet(featureID);
  }

} //packed_conformant_array_schemaImpl
