/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_declaration#getFormalParameterList <em>Formal Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_declaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_declaration#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_declaration()
 * @model
 * @generated
 */
public interface function_declaration extends EObject
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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_declaration#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_declaration_FormalParameterList()
   * @model containment="true"
   * @generated
   */
  formal_parameter_list getFormalParameterList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_declaration#getFormalParameterList <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Parameter List</em>' containment reference.
   * @see #getFormalParameterList()
   * @generated
   */
  void setFormalParameterList(formal_parameter_list value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_declaration_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_declaration_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_declaration#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

} // function_declaration
