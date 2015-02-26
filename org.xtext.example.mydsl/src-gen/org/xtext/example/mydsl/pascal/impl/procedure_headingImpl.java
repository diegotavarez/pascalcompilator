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
import org.xtext.example.mydsl.pascal.procedure_heading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>procedure heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.procedure_headingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.procedure_headingImpl#getFormalParameterList <em>Formal Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class procedure_headingImpl extends MinimalEObjectImpl.Container implements procedure_heading
{
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
   * The cached value of the '{@link #getFormalParameterList() <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParameterList()
   * @generated
   * @ordered
   */
  protected formal_parameter_list formalParameterList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected procedure_headingImpl()
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
    return PascalPackage.Literals.PROCEDURE_HEADING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, oldFormalParameterList, newFormalParameterList);
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
        msgs = ((InternalEObject)formalParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, null, msgs);
      if (newFormalParameterList != null)
        msgs = ((InternalEObject)newFormalParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, null, msgs);
      msgs = basicSetFormalParameterList(newFormalParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST, newFormalParameterList, newFormalParameterList));
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
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
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
      case PascalPackage.PROCEDURE_HEADING__NAME:
        return getName();
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        return getFormalParameterList();
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
      case PascalPackage.PROCEDURE_HEADING__NAME:
        setName((String)newValue);
        return;
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        setFormalParameterList((formal_parameter_list)newValue);
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
      case PascalPackage.PROCEDURE_HEADING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        setFormalParameterList((formal_parameter_list)null);
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
      case PascalPackage.PROCEDURE_HEADING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PascalPackage.PROCEDURE_HEADING__FORMAL_PARAMETER_LIST:
        return formalParameterList != null;
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

} //procedure_headingImpl
