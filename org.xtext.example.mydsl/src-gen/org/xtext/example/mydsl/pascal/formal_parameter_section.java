/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal parameter section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getValueParameterSection <em>Value Parameter Section</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getVariableParamenterSection <em>Variable Paramenter Section</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getProcedureHeading <em>Procedure Heading</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getFunctionHeading <em>Function Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getformal_parameter_section()
 * @model
 * @generated
 */
public interface formal_parameter_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Value Parameter Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Parameter Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Parameter Section</em>' containment reference.
   * @see #setValueParameterSection(value_parameter_section)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getformal_parameter_section_ValueParameterSection()
   * @model containment="true"
   * @generated
   */
  value_parameter_section getValueParameterSection();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getValueParameterSection <em>Value Parameter Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Parameter Section</em>' containment reference.
   * @see #getValueParameterSection()
   * @generated
   */
  void setValueParameterSection(value_parameter_section value);

  /**
   * Returns the value of the '<em><b>Variable Paramenter Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Paramenter Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Paramenter Section</em>' containment reference.
   * @see #setVariableParamenterSection(variable_parameter_section)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getformal_parameter_section_VariableParamenterSection()
   * @model containment="true"
   * @generated
   */
  variable_parameter_section getVariableParamenterSection();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getVariableParamenterSection <em>Variable Paramenter Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Paramenter Section</em>' containment reference.
   * @see #getVariableParamenterSection()
   * @generated
   */
  void setVariableParamenterSection(variable_parameter_section value);

  /**
   * Returns the value of the '<em><b>Procedure Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Heading</em>' containment reference.
   * @see #setProcedureHeading(procedure_heading)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getformal_parameter_section_ProcedureHeading()
   * @model containment="true"
   * @generated
   */
  procedure_heading getProcedureHeading();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getProcedureHeading <em>Procedure Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Heading</em>' containment reference.
   * @see #getProcedureHeading()
   * @generated
   */
  void setProcedureHeading(procedure_heading value);

  /**
   * Returns the value of the '<em><b>Function Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Heading</em>' containment reference.
   * @see #setFunctionHeading(function_heading)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getformal_parameter_section_FunctionHeading()
   * @model containment="true"
   * @generated
   */
  function_heading getFunctionHeading();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.formal_parameter_section#getFunctionHeading <em>Function Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Heading</em>' containment reference.
   * @see #getFunctionHeading()
   * @generated
   */
  void setFunctionHeading(function_heading value);

} // formal_parameter_section
