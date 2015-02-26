/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.expression#getSimpleExpressions <em>Simple Expressions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.expression#getRelational_operators <em>Relational operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.simple_expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Expressions</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getexpression_SimpleExpressions()
   * @model containment="true"
   * @generated
   */
  EList<simple_expression> getSimpleExpressions();

  /**
   * Returns the value of the '<em><b>Relational operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational operators</em>' attribute list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getexpression_Relational_operators()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelational_operators();

} // expression
