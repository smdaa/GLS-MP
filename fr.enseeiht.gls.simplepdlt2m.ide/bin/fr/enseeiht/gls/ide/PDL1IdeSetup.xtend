/*
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gls.ide

import com.google.inject.Guice
import fr.enseeiht.gls.PDL1RuntimeModule
import fr.enseeiht.gls.PDL1StandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PDL1IdeSetup extends PDL1StandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PDL1RuntimeModule, new PDL1IdeModule))
	}
	
}
