/**
 * <copyright>
 * </copyright>
 *

 */
package hu.bme.mit.androtext.lang.androTextDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.androtext.lang.androTextDsl.PreferenceCategory#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceCategory()
 * @model
 * @generated
 */
public interface PreferenceCategory extends AbstractPreference
{
  /**
   * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.androtext.lang.androTextDsl.AbstractPreference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preferences</em>' containment reference list.
   * @see hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage#getPreferenceCategory_Preferences()
   * @model containment="true"
   * @generated
   */
  EList<AbstractPreference> getPreferences();

} // PreferenceCategory
