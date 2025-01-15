/*
 * generated by Xtext 2.33.0
 */
package uk.ac.kcl.inf.mdd.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.kcl.inf.mdd.SpellLangRuntimeModule
import uk.ac.kcl.inf.mdd.SpellLangStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SpellLangIdeSetup extends SpellLangStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SpellLangRuntimeModule, new SpellLangIdeModule))
	}
	
}
