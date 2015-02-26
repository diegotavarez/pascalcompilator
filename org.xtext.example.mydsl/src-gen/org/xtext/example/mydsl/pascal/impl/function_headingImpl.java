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
import org.xtext.example.mydsl.pascal.formal_parameter_list;
import org.xtext.example.mydsl.pascal.function_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.function_headingImpl#getId1 <em>Id1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.function_headingImpl#getFormalParameterList <em>Formal Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.function_headingImpl#getId2 <em>Id2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class function_headingImpl extends MinimalEObjectImpl.Container implements function_heading
{
  /**
   * The default value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected static final String ID1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected String id1 = ID1_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormalParameterList() <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParameterList()
   * @generated
   * @ordered
   */
  protected formal_parameter_list formalParameterList;

  /**
   * The default value of the '{@link #getId2() <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected static final String ID2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId2() <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected String id2 = ID2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected function_headingImpl()
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
    return PascalPackage.Literals.FUNCTION_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId1()
  {
    return id1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId1(String newId1)
  {
    String oldId1 = id1;
    id1 = newId1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_HEADING__ID1, oldId1, id1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_list getFormalParameterList()
  {
    return formalParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalParameterList(formal_parameter_list newFormalParameterList, NotificationChain msgs)
  {
    formal_parameter_list oldFormalParameterList = formalParameterList;
    formalParameterList = newFormalParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST, oldFormalParameterList, newFormalParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalParameterList(formal_parameter_list newFormalParameterList)
  {
    if (newFormalParameterList != formalParameterList)
    {
      NotificationChain msgs = null;
      if (formalParameterList != null)
        msgs = ((InternalEObject)formalParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST, null, msgs);
      if (newFormalParameterList != null)
        msgs = ((InternalEObject)newFormalParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST, null, msgs);
      msgs = basicSetFormalParameterList(newFormalParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST, newFormalParameterList, newFormalParameterList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId2()
  {
    return id2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId2(String newId2)
  {
    String oldId2 = id2;
    id2 = newId2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FUNCTION_HEADING__ID2, oldId2, id2));
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
      case PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST:
        return basicSetFormalParameterList(null, msgs);
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
      case PascalPackage.FUNCTION_HEADING__ID1:
        return getId1();
      case PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST:
        return getFormalParameterList();
      case PascalPackage.FUNCTION_HEADING__ID2:
        return getId2();
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
      case PascalPackage.FUNCTION_HEADING__ID1:
        setId1((String)newValue);
        return;
      case PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST:
        setFormalParameterList((formal_parameter_list)newValue);
        return;
      case PascalPackage.FUNCTION_HEADING__ID2:
        setId2((String)newValue);
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
      case PascalPackage.FUNCTION_HEADING__ID1:
        setId1(ID1_EDEFAULT);
        return;
      case PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST:
        setFormalParameterList((formal_parameter_list)null);
        return;
      case PascalPackage.FUNCTION_HEADING__ID2:
        setId2(ID2_EDEFAULT);
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
      case PascalPackage.FUNCTION_HEADING__ID1:
        return ID1_EDEFAULT == null ? id1 != null : !ID1_EDEFAULT.equals(id1);
      case PascalPackage.FUNCTION_HEADING__FORMAL_PARAMETER_LIST:
        return formalParameterList != null;
      case PascalPackage.FUNCTION_HEADING__ID2:
        return ID2_EDEFAULT == null ? id2 != null : !ID2_EDEFAULT.equals(id2);
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
    result.append(" (id1: ");
    result.append(id1);
    result.append(", id2: ");
    result.append(id2);
    result.append(')');
    return result.toString();
  }

} //function_headingImpl
