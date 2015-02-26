/**
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.formal_parameter_list;
import org.xtext.example.mydsl.pascal.formal_parameter_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>formal parameter list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_listImpl#getFormalParameterSections <em>Formal Parameter Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class formal_parameter_listImpl extends MinimalEObjectImpl.Container implements formal_parameter_list
{
  /**
   * The cached value of the '{@link #getFormalParameterSections() <em>Formal Parameter Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParameterSections()
   * @generated
   * @ordered
   */
  protected EList<formal_parameter_section> formalParameterSections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected formal_parameter_listImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.FORMAL_PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<formal_parameter_section> getFormalParameterSections()
  {
    if (formalParameterSections == null)
    {
      formalParameterSections = new EObjectContainmentEList<formal_parameter_section>(formal_parameter_section.class, this, PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS);
    }
    return formalParameterSections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS:
        return ((InternalEList<?>)getFormalParameterSections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS:
        return getFormalParameterSections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS:
        getFormalParameterSections().clear();
        getFormalParameterSections().addAll((Collection<? extends formal_parameter_section>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS:
        getFormalParameterSections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.FORMAL_PARAMETER_LIST__FORMAL_PARAMETER_SECTIONS:
        return formalParameterSections != null && !formalParameterSections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //formal_parameter_listImpl
