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
import org.xtext.example.mydsl.pascal.record_section;
import org.xtext.example.mydsl.pascal.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>record section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.record_sectionImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.record_sectionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class record_sectionImpl extends MinimalEObjectImpl.Container implements record_section
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected record_sectionImpl()
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
    return PascalPackage.Literals.RECORD_SECTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
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
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type newType, NotificationChain msgs)
  {
    type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_SECTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_SECTION__TYPE, newType, newType));
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
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
      case PascalPackage.RECORD_SECTION__TYPE:
        return basicSetType(null, msgs);
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
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        return getIdentifierList();
      case PascalPackage.RECORD_SECTION__TYPE:
        return getType();
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
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        setIdentifierList((identifier_list)newValue);
        return;
      case PascalPackage.RECORD_SECTION__TYPE:
        setType((type)newValue);
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
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        setIdentifierList((identifier_list)null);
        return;
      case PascalPackage.RECORD_SECTION__TYPE:
        setType((type)null);
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
      case PascalPackage.RECORD_SECTION__IDENTIFIER_LIST:
        return identifierList != null;
      case PascalPackage.RECORD_SECTION__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //record_sectionImpl
