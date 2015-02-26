/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedure_heading#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedure_heading#getFormalParameterList <em>Formal Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_heading()
 * @model
 * @generated
 */
public interface procedure_heading extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_heading_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedure_heading#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Parameter List</em>' containment reference.
   * @see #setFormalParameterList(formal_parameter_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_heading_FormalParameterList()
   * @model containment="true"
   * @generated
   */
  formal_parameter_list getFormalParameterList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedure_heading#getFormalParameterList <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Parameter List</em>' containment reference.
   * @see #getFormalParameterList()
   * @generated
   */
  void setFormalParameterList(formal_parameter_list value);

} // procedure_heading
