/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PackageDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DomainModelImpl#getPackageDeclaration <em>Package Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel
{
  /**
   * The cached value of the '{@link #getPackageDeclaration() <em>Package Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageDeclaration()
   * @generated
   * @ordered
   */
  protected PackageDeclaration packageDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelImpl()
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
    return MyDslPackage.Literals.DOMAIN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getPackageDeclaration()
  {
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackageDeclaration(PackageDeclaration newPackageDeclaration, NotificationChain msgs)
  {
    PackageDeclaration oldPackageDeclaration = packageDeclaration;
    packageDeclaration = newPackageDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION, oldPackageDeclaration, newPackageDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageDeclaration(PackageDeclaration newPackageDeclaration)
  {
    if (newPackageDeclaration != packageDeclaration)
    {
      NotificationChain msgs = null;
      if (packageDeclaration != null)
        msgs = ((InternalEObject)packageDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION, null, msgs);
      if (newPackageDeclaration != null)
        msgs = ((InternalEObject)newPackageDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION, null, msgs);
      msgs = basicSetPackageDeclaration(newPackageDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION, newPackageDeclaration, newPackageDeclaration));
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
      case MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION:
        return basicSetPackageDeclaration(null, msgs);
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
      case MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION:
        return getPackageDeclaration();
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
      case MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION:
        setPackageDeclaration((PackageDeclaration)newValue);
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
      case MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION:
        setPackageDeclaration((PackageDeclaration)null);
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
      case MyDslPackage.DOMAIN_MODEL__PACKAGE_DECLARATION:
        return packageDeclaration != null;
    }
    return super.eIsSet(featureID);
  }

} //DomainModelImpl
