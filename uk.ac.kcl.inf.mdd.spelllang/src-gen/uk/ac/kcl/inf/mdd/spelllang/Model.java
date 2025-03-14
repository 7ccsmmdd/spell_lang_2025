/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.spellLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.spellLang.Model#getSpells <em>Spells</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.spellLang.Model#getSession <em>Session</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.spellLang.SpellLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Spells</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mdd.spellLang.SpellDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spells</em>' containment reference list.
   * @see uk.ac.kcl.inf.mdd.spellLang.SpellLangPackage#getModel_Spells()
   * @model containment="true"
   * @generated
   */
  EList<SpellDefinition> getSpells();

  /**
   * Returns the value of the '<em><b>Session</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mdd.spellLang.SpellInvocation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session</em>' containment reference list.
   * @see uk.ac.kcl.inf.mdd.spellLang.SpellLangPackage#getModel_Session()
   * @model containment="true"
   * @generated
   */
  EList<SpellInvocation> getSession();

} // Model
