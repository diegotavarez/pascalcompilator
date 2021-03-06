/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.ElementList#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getElementList()
 * @model
 * @generated
 */
public interface ElementList extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getElementList_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpressions();

} // ElementList
