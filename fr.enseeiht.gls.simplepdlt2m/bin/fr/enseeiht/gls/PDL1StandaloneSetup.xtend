/*
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.gls


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PDL1StandaloneSetup extends PDL1StandaloneSetupGenerated {

	def static void doSetup() {
		new PDL1StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
