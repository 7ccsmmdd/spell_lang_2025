/**
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.mdd.SpellLangRuntimeModule;
import uk.ac.kcl.inf.mdd.SpellLangStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SpellLangIdeSetup extends SpellLangStandaloneSetup {
  @Override
  public Injector createInjector() {
    SpellLangRuntimeModule _spellLangRuntimeModule = new SpellLangRuntimeModule();
    SpellLangIdeModule _spellLangIdeModule = new SpellLangIdeModule();
    return Guice.createInjector(Modules2.mixin(_spellLangRuntimeModule, _spellLangIdeModule));
  }
}
