/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.for_statement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.for_statement#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.for_statement#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.for_statement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getfor_statement()
 * @model
 * @generated
 */
public interface for_statement extends repetitive_statement
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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfor_statement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.for_statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression1</em>' containment reference.
   * @see #setExpression1(expression)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfor_statement_Expression1()
   * @model containment="true"
   * @generated
   */
  expression getExpression1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.for_statement#getExpression1 <em>Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression1</em>' containment reference.
   * @see #getExpression1()
   * @generated
   */
  void setExpression1(expression value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference.
   * @see #setExpression2(expression)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfor_statement_Expression2()
   * @model containment="true"
   * @generated
   */
  expression getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.for_statement#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(expression value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfor_statement_Statement()
   * @model containment="true"
   * @generated
   */
  statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.for_statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement value);

} // for_statement
