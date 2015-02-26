/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subrange type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.subrange_type#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.subrange_type#getConstant2 <em>Constant2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getsubrange_type()
 * @model
 * @generated
 */
public interface subrange_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(constant)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsubrange_type_Constant()
   * @model containment="true"
   * @generated
   */
  constant getConstant();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.subrange_type#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(constant value);

  /**
   * Returns the value of the '<em><b>Constant2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant2</em>' containment reference.
   * @see #setConstant2(constant)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsubrange_type_Constant2()
   * @model containment="true"
   * @generated
   */
  constant getConstant2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.subrange_type#getConstant2 <em>Constant2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant2</em>' containment reference.
   * @see #getConstant2()
   * @generated
   */
  void setConstant2(constant value);

} // subrange_type
