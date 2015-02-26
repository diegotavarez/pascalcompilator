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
import org.xtext.example.mydsl.pascal.type_definition;
import org.xtext.example.mydsl.pascal.type_definition_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>type definition part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.type_definition_partImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class type_definition_partImpl extends MinimalEObjectImpl.Container implements type_definition_part
{
  /**
   * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinitions()
   * @generated
   * @ordered
   */
  protected EList<type_definition> typeDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected type_definition_partImpl()
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
    return PascalPackage.Literals.TYPE_DEFINITION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<type_definition> getTypeDefinitions()
  {
    if (typeDefinitions == null)
    {
      typeDefinitions = new EObjectContainmentEList<type_definition>(type_definition.class, this, PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITIONS);
    }
    return typeDefinitions;
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITIONS:
        return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITIONS:
        return getTypeDefinitions();
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
        getTypeDefinitions().addAll((Collection<? extends type_definition>)newValue);
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
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
      case PascalPackage.TYPE_DEFINITION_PART__TYPE_DEFINITIONS:
        return typeDefinitions != null && !typeDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //type_definition_partImpl
