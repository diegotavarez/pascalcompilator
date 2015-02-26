/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.procedure_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>procedure statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.procedure_statementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.procedure_statementImpl#getActualParameterList <em>Actual Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class procedure_statementImpl extends simple_statementImpl implements procedure_statement
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
   * The default value of the '{@link #getActualParameterList() <em>Actual Parameter List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualParameterList()
   * @generated
   * @ordered
   */
  protected static final String ACTUAL_PARAMETER_LIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActualParameterList() <em>Actual Parameter List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualParameterList()
   * @generated
   * @ordered
   */
  protected String actualParameterList = ACTUAL_PARAMETER_LIST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected procedure_statementImpl()
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
    return PascalPackage.Literals.PROCEDURE_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActualParameterList()
  {
    return actualParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActualParameterList(String newActualParameterList)
  {
    String oldActualParameterList = actualParameterList;
    actualParameterList = newActualParameterList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST, oldActualParameterList, actualParameterList));
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
      case PascalPackage.PROCEDURE_STATEMENT__NAME:
        return getName();
      case PascalPackage.PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST:
        return getActualParameterList();
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
      case PascalPackage.PROCEDURE_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case PascalPackage.PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST:
        setActualParameterList((String)newValue);
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
      case PascalPackage.PROCEDURE_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PascalPackage.PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST:
        setActualParameterList(ACTUAL_PARAMETER_LIST_EDEFAULT);
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
      case PascalPackage.PROCEDURE_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PascalPackage.PROCEDURE_STATEMENT__ACTUAL_PARAMETER_LIST:
        return ACTUAL_PARAMETER_LIST_EDEFAULT == null ? actualParameterList != null : !ACTUAL_PARAMETER_LIST_EDEFAULT.equals(actualParameterList);
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
    result.append(", actualParameterList: ");
    result.append(actualParameterList);
    result.append(')');
    return result.toString();
  }

} //procedure_statementImpl
