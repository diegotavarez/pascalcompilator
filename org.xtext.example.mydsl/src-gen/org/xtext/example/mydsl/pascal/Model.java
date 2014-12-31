/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.Model#getPrograms <em>Programs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Programs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Programs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Programs</em>' attribute list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getModel_Programs()
   * @model unique="false"
   * @generated
   */
  EList<String> getPrograms();

} // Model
