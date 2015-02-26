/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.Set#getElementList <em>Element List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends EObject
{
  /**
   * Returns the value of the '<em><b>Element List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element List</em>' containment reference.
   * @see #setElementList(ElementList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getSet_ElementList()
   * @model containment="true"
   * @generated
   */
  ElementList getElementList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.Set#getElementList <em>Element List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element List</em>' containment reference.
   * @see #getElementList()
   * @generated
   */
  void setElementList(ElementList value);

} // Set
