/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedure_statement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedure_statement#getActualParameterList <em>Actual Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_statement()
 * @model
 * @generated
 */
public interface procedure_statement extends simple_statement
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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_statement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedure_statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actual Parameter List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Parameter List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Parameter List</em>' attribute.
   * @see #setActualParameterList(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_statement_ActualParameterList()
   * @model
   * @generated
   */
  String getActualParameterList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedure_statement#getActualParameterList <em>Actual Parameter List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual Parameter List</em>' attribute.
   * @see #getActualParameterList()
   * @generated
   */
  void setActualParameterList(String value);

} // procedure_statement
