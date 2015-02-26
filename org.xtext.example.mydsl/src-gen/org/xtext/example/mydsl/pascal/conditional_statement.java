/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conditional statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.conditional_statement#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.conditional_statement#getCaseStatement <em>Case Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getconditional_statement()
 * @model
 * @generated
 */
public interface conditional_statement extends structured_statement
{
  /**
   * Returns the value of the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Statement</em>' containment reference.
   * @see #setIfStatement(if_statement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconditional_statement_IfStatement()
   * @model containment="true"
   * @generated
   */
  if_statement getIfStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.conditional_statement#getIfStatement <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Statement</em>' containment reference.
   * @see #getIfStatement()
   * @generated
   */
  void setIfStatement(if_statement value);

  /**
   * Returns the value of the '<em><b>Case Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Statement</em>' containment reference.
   * @see #setCaseStatement(case_statement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconditional_statement_CaseStatement()
   * @model containment="true"
   * @generated
   */
  case_statement getCaseStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.conditional_statement#getCaseStatement <em>Case Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Statement</em>' containment reference.
   * @see #getCaseStatement()
   * @generated
   */
  void setCaseStatement(case_statement value);

} // conditional_statement
