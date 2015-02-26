/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.Variable1#getExpressionList <em>Expression List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.Variable1#getVariable1 <em>Variable1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.Variable1#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getVariable1()
 * @model
 * @generated
 */
public interface Variable1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression List</em>' containment reference.
   * @see #setExpressionList(ExpressionList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getVariable1_ExpressionList()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.Variable1#getExpressionList <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression List</em>' containment reference.
   * @see #getExpressionList()
   * @generated
   */
  void setExpressionList(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Variable1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable1</em>' containment reference.
   * @see #setVariable1(Variable1)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getVariable1_Variable1()
   * @model containment="true"
   * @generated
   */
  Variable1 getVariable1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.Variable1#getVariable1 <em>Variable1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable1</em>' containment reference.
   * @see #getVariable1()
   * @generated
   */
  void setVariable1(Variable1 value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getVariable1_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.Variable1#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Variable1
