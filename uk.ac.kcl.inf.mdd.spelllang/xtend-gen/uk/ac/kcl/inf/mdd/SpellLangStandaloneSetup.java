/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SpellLangStandaloneSetup extends SpellLangStandaloneSetupGenerated {
  public static void doSetup() {
    new SpellLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
