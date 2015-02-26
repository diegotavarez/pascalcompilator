/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.pointer_type;
import org.xtext.example.mydsl.pascal.simple_type;
import org.xtext.example.mydsl.pascal.structured_type;
import org.xtext.example.mydsl.pascal.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeImpl#getStructuredType <em>Structured Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeImpl#getPointerType <em>Pointer Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.typeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class typeImpl extends type_definitionImpl implements type
{
  /**
   * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleType()
   * @generated
   * @ordered
   */
  protected simple_type simpleType;

  /**
   * The cached value of the '{@link #getStructuredType() <em>Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructuredType()
   * @generated
   * @ordered
   */
  protected structured_type structuredType;

  /**
   * The cached value of the '{@link #getPointerType() <em>Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointerType()
   * @generated
   * @ordered
   */
  protected pointer_type pointerType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected typeImpl()
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
    return PascalPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_type getSimpleType()
  {
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleType(simple_type newSimpleType, NotificationChain msgs)
  {
    simple_type oldSimpleType = simpleType;
    simpleType = newSimpleType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__SIMPLE_TYPE, oldSimpleType, newSimpleType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleType(simple_type newSimpleType)
  {
    if (newSimpleType != simpleType)
    {
      NotificationChain msgs = null;
      if (simpleType != null)
        msgs = ((InternalEObject)simpleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__SIMPLE_TYPE, null, msgs);
      if (newSimpleType != null)
        msgs = ((InternalEObject)newSimpleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__SIMPLE_TYPE, null, msgs);
      msgs = basicSetSimpleType(newSimpleType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__SIMPLE_TYPE, newSimpleType, newSimpleType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structured_type getStructuredType()
  {
    return structuredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructuredType(structured_type newStructuredType, NotificationChain msgs)
  {
    structured_type oldStructuredType = structuredType;
    structuredType = newStructuredType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__STRUCTURED_TYPE, oldStructuredType, newStructuredType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructuredType(structured_type newStructuredType)
  {
    if (newStructuredType != structuredType)
    {
      NotificationChain msgs = null;
      if (structuredType != null)
        msgs = ((InternalEObject)structuredType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__STRUCTURED_TYPE, null, msgs);
      if (newStructuredType != null)
        msgs = ((InternalEObject)newStructuredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__STRUCTURED_TYPE, null, msgs);
      msgs = basicSetStructuredType(newStructuredType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__STRUCTURED_TYPE, newStructuredType, newStructuredType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer_type getPointerType()
  {
    return pointerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointerType(pointer_type newPointerType, NotificationChain msgs)
  {
    pointer_type oldPointerType = pointerType;
    pointerType = newPointerType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__POINTER_TYPE, oldPointerType, newPointerType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointerType(pointer_type newPointerType)
  {
    if (newPointerType != pointerType)
    {
      NotificationChain msgs = null;
      if (pointerType != null)
        msgs = ((InternalEObject)pointerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__POINTER_TYPE, null, msgs);
      if (newPointerType != null)
        msgs = ((InternalEObject)newPointerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.TYPE__POINTER_TYPE, null, msgs);
      msgs = basicSetPointerType(newPointerType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__POINTER_TYPE, newPointerType, newPointerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.TYPE__NAME, oldName, name));
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        return basicSetSimpleType(null, msgs);
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        return basicSetStructuredType(null, msgs);
      case PascalPackage.TYPE__POINTER_TYPE:
        return basicSetPointerType(null, msgs);
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        return getSimpleType();
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        return getStructuredType();
      case PascalPackage.TYPE__POINTER_TYPE:
        return getPointerType();
      case PascalPackage.TYPE__NAME:
        return getName();
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        setSimpleType((simple_type)newValue);
        return;
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        setStructuredType((structured_type)newValue);
        return;
      case PascalPackage.TYPE__POINTER_TYPE:
        setPointerType((pointer_type)newValue);
        return;
      case PascalPackage.TYPE__NAME:
        setName((String)newValue);
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        setSimpleType((simple_type)null);
        return;
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        setStructuredType((structured_type)null);
        return;
      case PascalPackage.TYPE__POINTER_TYPE:
        setPointerType((pointer_type)null);
        return;
      case PascalPackage.TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case PascalPackage.TYPE__SIMPLE_TYPE:
        return simpleType != null;
      case PascalPackage.TYPE__STRUCTURED_TYPE:
        return structuredType != null;
      case PascalPackage.TYPE__POINTER_TYPE:
        return pointerType != null;
      case PascalPackage.TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //typeImpl
