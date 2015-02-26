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
import org.xtext.example.mydsl.pascal.formal_parameter_section;
import org.xtext.example.mydsl.pascal.function_heading;
import org.xtext.example.mydsl.pascal.procedure_heading;
import org.xtext.example.mydsl.pascal.value_parameter_section;
import org.xtext.example.mydsl.pascal.variable_parameter_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>formal parameter section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getValueParameterSection <em>Value Parameter Section</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getVariableParamenterSection <em>Variable Paramenter Section</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getProcedureHeading <em>Procedure Heading</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getFunctionHeading <em>Function Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class formal_parameter_sectionImpl extends MinimalEObjectImpl.Container implements formal_parameter_section
{
  /**
   * The cached value of the '{@link #getValueParameterSection() <em>Value Parameter Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueParameterSection()
   * @generated
   * @ordered
   */
  protected value_parameter_section valueParameterSection;

  /**
   * The cached value of the '{@link #getVariableParamenterSection() <em>Variable Paramenter Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableParamenterSection()
   * @generated
   * @ordered
   */
  protected variable_parameter_section variableParamenterSection;

  /**
   * The cached value of the '{@link #getProcedureHeading() <em>Procedure Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureHeading()
   * @generated
   * @ordered
   */
  protected procedure_heading procedureHeading;

  /**
   * The cached value of the '{@link #getFunctionHeading() <em>Function Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionHeading()
   * @generated
   * @ordered
   */
  protected function_heading functionHeading;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected formal_parameter_sectionImpl()
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
    return PascalPackage.Literals.FORMAL_PARAMETER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value_parameter_section getValueParameterSection()
  {
    return valueParameterSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueParameterSection(value_parameter_section newValueParameterSection, NotificationChain msgs)
  {
    value_parameter_section oldValueParameterSection = valueParameterSection;
    valueParameterSection = newValueParameterSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION, oldValueParameterSection, newValueParameterSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueParameterSection(value_parameter_section newValueParameterSection)
  {
    if (newValueParameterSection != valueParameterSection)
    {
      NotificationChain msgs = null;
      if (valueParameterSection != null)
        msgs = ((InternalEObject)valueParameterSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION, null, msgs);
      if (newValueParameterSection != null)
        msgs = ((InternalEObject)newValueParameterSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION, null, msgs);
      msgs = basicSetValueParameterSection(newValueParameterSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION, newValueParameterSection, newValueParameterSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_parameter_section getVariableParamenterSection()
  {
    return variableParamenterSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableParamenterSection(variable_parameter_section newVariableParamenterSection, NotificationChain msgs)
  {
    variable_parameter_section oldVariableParamenterSection = variableParamenterSection;
    variableParamenterSection = newVariableParamenterSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION, oldVariableParamenterSection, newVariableParamenterSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableParamenterSection(variable_parameter_section newVariableParamenterSection)
  {
    if (newVariableParamenterSection != variableParamenterSection)
    {
      NotificationChain msgs = null;
      if (variableParamenterSection != null)
        msgs = ((InternalEObject)variableParamenterSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION, null, msgs);
      if (newVariableParamenterSection != null)
        msgs = ((InternalEObject)newVariableParamenterSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION, null, msgs);
      msgs = basicSetVariableParamenterSection(newVariableParamenterSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION, newVariableParamenterSection, newVariableParamenterSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_heading getProcedureHeading()
  {
    return procedureHeading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedureHeading(procedure_heading newProcedureHeading, NotificationChain msgs)
  {
    procedure_heading oldProcedureHeading = procedureHeading;
    procedureHeading = newProcedureHeading;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING, oldProcedureHeading, newProcedureHeading);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedureHeading(procedure_heading newProcedureHeading)
  {
    if (newProcedureHeading != procedureHeading)
    {
      NotificationChain msgs = null;
      if (procedureHeading != null)
        msgs = ((InternalEObject)procedureHeading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING, null, msgs);
      if (newProcedureHeading != null)
        msgs = ((InternalEObject)newProcedureHeading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING, null, msgs);
      msgs = basicSetProcedureHeading(newProcedureHeading, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING, newProcedureHeading, newProcedureHeading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_heading getFunctionHeading()
  {
    return functionHeading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionHeading(function_heading newFunctionHeading, NotificationChain msgs)
  {
    function_heading oldFunctionHeading = functionHeading;
    functionHeading = newFunctionHeading;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING, oldFunctionHeading, newFunctionHeading);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionHeading(function_heading newFunctionHeading)
  {
    if (newFunctionHeading != functionHeading)
    {
      NotificationChain msgs = null;
      if (functionHeading != null)
        msgs = ((InternalEObject)functionHeading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING, null, msgs);
      if (newFunctionHeading != null)
        msgs = ((InternalEObject)newFunctionHeading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING, null, msgs);
      msgs = basicSetFunctionHeading(newFunctionHeading, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING, newFunctionHeading, newFunctionHeading));
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION:
        return basicSetValueParameterSection(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION:
        return basicSetVariableParamenterSection(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING:
        return basicSetProcedureHeading(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING:
        return basicSetFunctionHeading(null, msgs);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION:
        return getValueParameterSection();
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION:
        return getVariableParamenterSection();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING:
        return getProcedureHeading();
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING:
        return getFunctionHeading();
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION:
        setValueParameterSection((value_parameter_section)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION:
        setVariableParamenterSection((variable_parameter_section)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING:
        setProcedureHeading((procedure_heading)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING:
        setFunctionHeading((function_heading)newValue);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION:
        setValueParameterSection((value_parameter_section)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION:
        setVariableParamenterSection((variable_parameter_section)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING:
        setProcedureHeading((procedure_heading)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING:
        setFunctionHeading((function_heading)null);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE_PARAMETER_SECTION:
        return valueParameterSection != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE_PARAMENTER_SECTION:
        return variableParamenterSection != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE_HEADING:
        return procedureHeading != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION_HEADING:
        return functionHeading != null;
    }
    return super.eIsSet(featureID);
  }

} //formal_parameter_sectionImpl
