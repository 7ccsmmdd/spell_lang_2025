/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.spellLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mdd.spellLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpellLangFactoryImpl extends EFactoryImpl implements SpellLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpellLangFactory init()
  {
    try
    {
      SpellLangFactory theSpellLangFactory = (SpellLangFactory)EPackage.Registry.INSTANCE.getEFactory(SpellLangPackage.eNS_URI);
      if (theSpellLangFactory != null)
      {
        return theSpellLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpellLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpellLangPackage.MODEL: return createModel();
      case SpellLangPackage.SPELL_DEFINITION: return createSpellDefinition();
      case SpellLangPackage.SPELL_EXPRESSION: return createSpellExpression();
      case SpellLangPackage.SIMPLE_SPELL: return createSimpleSpell();
      case SpellLangPackage.SAY: return createSay();
      case SpellLangPackage.MOVE: return createMove();
      case SpellLangPackage.SPELL_INVOCATION: return createSpellInvocation();
      case SpellLangPackage.COMPLEX_SPELL: return createComplexSpell();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpellLangPackage.MOVEMENT:
        return createMovementFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpellLangPackage.MOVEMENT:
        return convertMovementToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpellDefinition createSpellDefinition()
  {
    SpellDefinitionImpl spellDefinition = new SpellDefinitionImpl();
    return spellDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpellExpression createSpellExpression()
  {
    SpellExpressionImpl spellExpression = new SpellExpressionImpl();
    return spellExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSpell createSimpleSpell()
  {
    SimpleSpellImpl simpleSpell = new SimpleSpellImpl();
    return simpleSpell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Say createSay()
  {
    SayImpl say = new SayImpl();
    return say;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpellInvocation createSpellInvocation()
  {
    SpellInvocationImpl spellInvocation = new SpellInvocationImpl();
    return spellInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComplexSpell createComplexSpell()
  {
    ComplexSpellImpl complexSpell = new ComplexSpellImpl();
    return complexSpell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Movement createMovementFromString(EDataType eDataType, String initialValue)
  {
    Movement result = Movement.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMovementToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SpellLangPackage getSpellLangPackage()
  {
    return (SpellLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpellLangPackage getPackage()
  {
    return SpellLangPackage.eINSTANCE;
  }

} //SpellLangFactoryImpl
