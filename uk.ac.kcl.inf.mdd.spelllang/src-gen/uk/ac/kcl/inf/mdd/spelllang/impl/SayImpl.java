/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.spellLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.mdd.spellLang.Say;
import uk.ac.kcl.inf.mdd.spellLang.SpellLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Say</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.spellLang.impl.SayImpl#getWord <em>Word</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SayImpl extends SimpleSpellImpl implements Say
{
  /**
   * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected static final String WORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected String word = WORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SayImpl()
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
    return SpellLangPackage.Literals.SAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWord()
  {
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWord(String newWord)
  {
    String oldWord = word;
    word = newWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellLangPackage.SAY__WORD, oldWord, word));
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
      case SpellLangPackage.SAY__WORD:
        return getWord();
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
      case SpellLangPackage.SAY__WORD:
        setWord((String)newValue);
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
      case SpellLangPackage.SAY__WORD:
        setWord(WORD_EDEFAULT);
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
      case SpellLangPackage.SAY__WORD:
        return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (word: ");
    result.append(word);
    result.append(')');
    return result.toString();
  }

} //SayImpl
