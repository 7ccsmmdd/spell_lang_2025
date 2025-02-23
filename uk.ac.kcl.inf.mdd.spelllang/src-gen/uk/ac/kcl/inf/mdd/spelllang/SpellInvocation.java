/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.spellLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spell Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.spellLang.SpellInvocation#getSpell <em>Spell</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.spellLang.SpellLangPackage#getSpellInvocation()
 * @model
 * @generated
 */
public interface SpellInvocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Spell</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spell</em>' reference.
   * @see #setSpell(SpellDefinition)
   * @see uk.ac.kcl.inf.mdd.spellLang.SpellLangPackage#getSpellInvocation_Spell()
   * @model
   * @generated
   */
  SpellDefinition getSpell();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.spellLang.SpellInvocation#getSpell <em>Spell</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spell</em>' reference.
   * @see #getSpell()
   * @generated
   */
  void setSpell(SpellDefinition value);

} // SpellInvocation
