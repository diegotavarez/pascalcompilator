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
import org.xtext.example.mydsl.pascal.fixed_part;
import org.xtext.example.mydsl.pascal.record_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fixed part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.fixed_partImpl#getRecordSections <em>Record Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fixed_partImpl extends MinimalEObjectImpl.Container implements fixed_part
{
  /**
   * The cached value of the '{@link #getRecordSections() <em>Record Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordSections()
   * @generated
   * @ordered
   */
  protected EList<record_section> recordSections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fixed_partImpl()
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
    return PascalPackage.Literals.FIXED_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<record_section> getRecordSections()
  {
    if (recordSections == null)
    {
      recordSections = new EObjectContainmentEList<record_section>(record_section.class, this, PascalPackage.FIXED_PART__RECORD_SECTIONS);
    }
    return recordSections;
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
      case PascalPackage.FIXED_PART__RECORD_SECTIONS:
        return ((InternalEList<?>)getRecordSections()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.FIXED_PART__RECORD_SECTIONS:
        return getRecordSections();
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
      case PascalPackage.FIXED_PART__RECORD_SECTIONS:
        getRecordSections().clear();
        getRecordSections().addAll((Collection<? extends record_section>)newValue);
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
      case PascalPackage.FIXED_PART__RECORD_SECTIONS:
        getRecordSections().clear();
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
      case PascalPackage.FIXED_PART__RECORD_SECTIONS:
        return recordSections != null && !recordSections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //fixed_partImpl
