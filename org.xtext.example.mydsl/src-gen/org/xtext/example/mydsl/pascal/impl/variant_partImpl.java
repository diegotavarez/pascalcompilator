/**
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.tag_field;
import org.xtext.example.mydsl.pascal.variant;
import org.xtext.example.mydsl.pascal.variant_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variant part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variant_partImpl#getTagfield <em>Tagfield</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variant_partImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variant_partImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variant_partImpl extends MinimalEObjectImpl.Container implements variant_part
{
  /**
   * The cached value of the '{@link #getTagfield() <em>Tagfield</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTagfield()
   * @generated
   * @ordered
   */
  protected tag_field tagfield;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<variant> variants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variant_partImpl()
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
    return PascalPackage.Literals.VARIANT_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tag_field getTagfield()
  {
    return tagfield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTagfield(tag_field newTagfield, NotificationChain msgs)
  {
    tag_field oldTagfield = tagfield;
    tagfield = newTagfield;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__TAGFIELD, oldTagfield, newTagfield);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTagfield(tag_field newTagfield)
  {
    if (newTagfield != tagfield)
    {
      NotificationChain msgs = null;
      if (tagfield != null)
        msgs = ((InternalEObject)tagfield).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__TAGFIELD, null, msgs);
      if (newTagfield != null)
        msgs = ((InternalEObject)newTagfield).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__TAGFIELD, null, msgs);
      msgs = basicSetTagfield(newTagfield, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__TAGFIELD, newTagfield, newTagfield));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variant> getVariants()
  {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<variant>(variant.class, this, PascalPackage.VARIANT_PART__VARIANTS);
    }
    return variants;
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
      case PascalPackage.VARIANT_PART__TAGFIELD:
        return basicSetTagfield(null, msgs);
      case PascalPackage.VARIANT_PART__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.VARIANT_PART__TAGFIELD:
        return getTagfield();
      case PascalPackage.VARIANT_PART__ID:
        return getId();
      case PascalPackage.VARIANT_PART__VARIANTS:
        return getVariants();
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
      case PascalPackage.VARIANT_PART__TAGFIELD:
        setTagfield((tag_field)newValue);
        return;
      case PascalPackage.VARIANT_PART__ID:
        setId((String)newValue);
        return;
      case PascalPackage.VARIANT_PART__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends variant>)newValue);
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
      case PascalPackage.VARIANT_PART__TAGFIELD:
        setTagfield((tag_field)null);
        return;
      case PascalPackage.VARIANT_PART__ID:
        setId(ID_EDEFAULT);
        return;
      case PascalPackage.VARIANT_PART__VARIANTS:
        getVariants().clear();
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
      case PascalPackage.VARIANT_PART__TAGFIELD:
        return tagfield != null;
      case PascalPackage.VARIANT_PART__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PascalPackage.VARIANT_PART__VARIANTS:
        return variants != null && !variants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //variant_partImpl
