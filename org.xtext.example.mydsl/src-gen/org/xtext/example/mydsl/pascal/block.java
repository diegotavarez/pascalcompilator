/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.block#getDeclarationPart <em>Declaration Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.block#getStatementPart <em>Statement Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getblock()
 * @model
 * @generated
 */
public interface block extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration Part</em>' containment reference.
   * @see #setDeclarationPart(DeclarationPart)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getblock_DeclarationPart()
   * @model containment="true"
   * @generated
   */
  DeclarationPart getDeclarationPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.block#getDeclarationPart <em>Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration Part</em>' containment reference.
   * @see #getDeclarationPart()
   * @generated
   */
  void setDeclarationPart(DeclarationPart value);

  /**
   * Returns the value of the '<em><b>Statement Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Part</em>' containment reference.
   * @see #setStatementPart(statement_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getblock_StatementPart()
   * @model containment="true"
   * @generated
   */
  statement_part getStatementPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.block#getStatementPart <em>Statement Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Part</em>' containment reference.
   * @see #getStatementPart()
   * @generated
   */
  void setStatementPart(statement_part value);

} // block
