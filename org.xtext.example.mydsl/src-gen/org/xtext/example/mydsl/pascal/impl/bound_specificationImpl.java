/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.bound_specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>bound specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.bound_specificationImpl#getId1 <em>Id1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.bound_specificationImpl#getId2 <em>Id2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.bound_specificationImpl#getId3 <em>Id3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class bound_specificationImpl extends MinimalEObjectImpl.Container implements bound_specification
{
  /**
   * The default value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected static final String ID1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected String id1 = ID1_EDEFAULT;

  /**
   * The default value of the '{@link #getId2() <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected static final String ID2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId2() <em>Id2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected String id2 = ID2_EDEFAULT;

  /**
   * The default value of the '{@link #getId3() <em>Id3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId3()
   * @generated
   * @ordered
   */
  protected static final String ID3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId3() <em>Id3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId3()
   * @generated
   * @ordered
   */
  protected String id3 = ID3_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected bound_specificationImpl()
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
    return PascalPackage.Literals.BOUND_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId1()
  {
    return id1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId1(String newId1)
  {
    String oldId1 = id1;
    id1 = newId1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__ID1, oldId1, id1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId2()
  {
    return id2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId2(String newId2)
  {
    String oldId2 = id2;
    id2 = newId2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__ID2, oldId2, id2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId3()
  {
    return id3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId3(String newId3)
  {
    String oldId3 = id3;
    id3 = newId3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BOUND_SPECIFICATION__ID3, oldId3, id3));
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
      case PascalPackage.BOUND_SPECIFICATION__ID1:
        return getId1();
      case PascalPackage.BOUND_SPECIFICATION__ID2:
        return getId2();
      case PascalPackage.BOUND_SPECIFICATION__ID3:
        return getId3();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.BOUND_SPECIFICATION__ID1:
        setId1((String)newValue);
        return;
      case PascalPackage.BOUND_SPECIFICATION__ID2:
        setId2((String)newValue);
        return;
      case PascalPackage.BOUND_SPECIFICATION__ID3:
        setId3((String)newValue);
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
      case PascalPackage.BOUND_SPECIFICATION__ID1:
        setId1(ID1_EDEFAULT);
        return;
      case PascalPackage.BOUND_SPECIFICATION__ID2:
        setId2(ID2_EDEFAULT);
        return;
      case PascalPackage.BOUND_SPECIFICATION__ID3:
        setId3(ID3_EDEFAULT);
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
      case PascalPackage.BOUND_SPECIFICATION__ID1:
        return ID1_EDEFAULT == null ? id1 != null : !ID1_EDEFAULT.equals(id1);
      case PascalPackage.BOUND_SPECIFICATION__ID2:
        return ID2_EDEFAULT == null ? id2 != null : !ID2_EDEFAULT.equals(id2);
      case PascalPackage.BOUND_SPECIFICATION__ID3:
        return ID3_EDEFAULT == null ? id3 != null : !ID3_EDEFAULT.equals(id3);
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
    result.append(" (id1: ");
    result.append(id1);
    result.append(", id2: ");
    result.append(id2);
    result.append(", id3: ");
    result.append(id3);
    result.append(')');
    return result.toString();
  }

} //bound_specificationImpl
