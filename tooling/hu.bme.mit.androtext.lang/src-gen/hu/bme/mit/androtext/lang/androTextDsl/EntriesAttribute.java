/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entries Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEntriesAttribute()
 * @model
 * @generated
 */
public interface EntriesAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' reference.
   * @see #setEntries(ArrayResource)
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getEntriesAttribute_Entries()
   * @model
   * @generated
   */
  ArrayResource getEntries();

  /**
   * Sets the value of the '{@link hu.bme.mit.androtext.lang.androTextDsl.EntriesAttribute#getEntries <em>Entries</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entries</em>' reference.
   * @see #getEntries()
   * @generated
   */
  void setEntries(ArrayResource value);

} // EntriesAttribute