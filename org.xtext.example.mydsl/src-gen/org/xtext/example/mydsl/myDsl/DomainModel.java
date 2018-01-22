/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DomainModel#getPackageDeclaration <em>Package Declaration</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Declaration</em>' containment reference.
   * @see #setPackageDeclaration(PackageDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDomainModel_PackageDeclaration()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getPackageDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DomainModel#getPackageDeclaration <em>Package Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Declaration</em>' containment reference.
   * @see #getPackageDeclaration()
   * @generated
   */
  void setPackageDeclaration(PackageDeclaration value);

} // DomainModel
