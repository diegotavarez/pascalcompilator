/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>value parameter section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.value_parameter_section#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.value_parameter_section#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvalue_parameter_section()
 * @model
 * @generated
 */
public interface value_parameter_section extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(identifier_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvalue_parameter_section_IdentifierList()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.value_parameter_section#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(identifier_list value);

  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' containment reference.
   * @see #setParameterType(parameter_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvalue_parameter_section_ParameterType()
   * @model containment="true"
   * @generated
   */
  parameter_type getParameterType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.value_parameter_section#getParameterType <em>Parameter Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' containment reference.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(parameter_type value);

} // value_parameter_section
