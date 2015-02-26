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
import org.xtext.example.mydsl.pascal.identifier_list;
import org.xtext.example.mydsl.pascal.parameter_type;
import org.xtext.example.mydsl.pascal.value_parameter_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>value parameter section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.value_parameter_sectionImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.value_parameter_sectionImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class value_parameter_sectionImpl extends MinimalEObjectImpl.Container implements value_parameter_section
{
  /**
   * The cached value of the '{@link #getIdentifierList() <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected identifier_list identifierList;

  /**
   * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterType()
   * @generated
   * @ordered
   */
  protected parameter_type parameterType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected value_parameter_sectionImpl()
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
    return PascalPackage.Literals.VALUE_PARAMETER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public identifier_list getIdentifierList()
  {
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifierList(identifier_list newIdentifierList, NotificationChain msgs)
  {
    identifier_list oldIdentifierList = identifierList;
    identifierList = newIdentifierList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierList(identifier_list newIdentifierList)
  {
    if (newIdentifierList != identifierList)
    {
      NotificationChain msgs = null;
      if (identifierList != null)
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameter_type getParameterType()
  {
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterType(parameter_type newParameterType, NotificationChain msgs)
  {
    parameter_type oldParameterType = parameterType;
    parameterType = newParameterType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, oldParameterType, newParameterType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterType(parameter_type newParameterType)
  {
    if (newParameterType != parameterType)
    {
      NotificationChain msgs = null;
      if (parameterType != null)
        msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, null, msgs);
      if (newParameterType != null)
        msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, null, msgs);
      msgs = basicSetParameterType(newParameterType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE, newParameterType, newParameterType));
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        return basicSetParameterType(null, msgs);
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        return getIdentifierList();
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        return getParameterType();
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        setIdentifierList((identifier_list)newValue);
        return;
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        setParameterType((parameter_type)newValue);
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        setIdentifierList((identifier_list)null);
        return;
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        setParameterType((parameter_type)null);
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
      case PascalPackage.VALUE_PARAMETER_SECTION__IDENTIFIER_LIST:
        return identifierList != null;
      case PascalPackage.VALUE_PARAMETER_SECTION__PARAMETER_TYPE:
        return parameterType != null;
    }
    return super.eIsSet(featureID);
  }

} //value_parameter_sectionImpl
