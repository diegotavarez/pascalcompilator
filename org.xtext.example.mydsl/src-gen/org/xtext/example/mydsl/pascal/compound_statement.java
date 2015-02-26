/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compound statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.compound_statement#getStatementSequence <em>Statement Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getcompound_statement()
 * @model
 * @generated
 */
public interface compound_statement extends structured_statement
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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getcompound_statement_StatementSequence()
   * @model containment="true"
   * @generated
   */
  statement_sequence getStatementSequence();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.compound_statement#getStatementSequence <em>Statement Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Sequence</em>' containment reference.
   * @see #getStatementSequence()
   * @generated
   */
  void setStatementSequence(statement_sequence value);

} // compound_statement
