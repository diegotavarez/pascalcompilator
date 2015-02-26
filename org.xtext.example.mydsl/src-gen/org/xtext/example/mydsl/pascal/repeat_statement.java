/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repeat statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.repeat_statement#getStatementSequence <em>Statement Sequence</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.repeat_statement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getrepeat_statement()
 * @model
 * @generated
 */
public interface repeat_statement extends repetitive_statement
{
  /**
   * Returns the value of the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Sequence</em>' containment reference.
   * @see #setStatementSequence(statement_sequence)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrepeat_statement_StatementSequence()
   * @model containment="true"
   * @generated
   */
  statement_sequence getStatementSequence();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.repeat_statement#getStatementSequence <em>Statement Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Sequence</em>' containment reference.
   * @see #getStatementSequence()
   * @generated
   */
  void setStatementSequence(statement_sequence value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrepeat_statement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.repeat_statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

} // repeat_statement
