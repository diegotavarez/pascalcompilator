/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>function heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_heading#getId1 <em>Id1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_heading#getFormalParameterList <em>Formal Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.function_heading#getId2 <em>Id2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_heading()
 * @model
 * @generated
 */
public interface function_heading extends EObject
{
  /**
   * Returns the value of the '<em><b>Id1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id1</em>' attribute.
   * @see #setId1(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_heading_Id1()
   * @model
   * @generated
   */
  String getId1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_heading#getId1 <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id1</em>' attribute.
   * @see #getId1()
   * @generated
   */
  void setId1(String value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_heading_FormalParameterList()
   * @model containment="true"
   * @generated
   */
  formal_parameter_list getFormalParameterList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_heading#getFormalParameterList <em>Formal Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Parameter List</em>' containment reference.
   * @see #getFormalParameterList()
   * @generated
   */
  void setFormalParameterList(formal_parameter_list value);

  /**
   * Returns the value of the '<em><b>Id2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id2</em>' attribute.
   * @see #setId2(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfunction_heading_Id2()
   * @model
   * @generated
   */
  String getId2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.function_heading#getId2 <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id2</em>' attribute.
   * @see #getId2()
   * @generated
   */
  void setId2(String value);

} // function_heading
