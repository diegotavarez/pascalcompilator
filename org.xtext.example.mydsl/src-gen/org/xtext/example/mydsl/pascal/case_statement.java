/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.case_statement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.case_statement#getCaseLimbs <em>Case Limbs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getcase_statement()
 * @model
 * @generated
 */
public interface case_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getcase_statement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.case_statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

  /**
   * Returns the value of the '<em><b>Case Limbs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.case_limb}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Limbs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Limbs</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getcase_statement_CaseLimbs()
   * @model containment="true"
   * @generated
   */
  EList<case_limb> getCaseLimbs();

} // case_statement
