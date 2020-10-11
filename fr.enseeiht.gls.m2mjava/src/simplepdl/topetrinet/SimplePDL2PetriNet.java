package simplepdl.topetrinet;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.*;
import simplepdl.Process;
import petrinet.*;

public class SimplePDL2PetriNet {
	
	public static void main(String[] args) {
		
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstancePDL = SimplepdlPackage.eINSTANCE;
		
		// Charger le package PetriNet afin de l'enregistrer dans le registre d'Eclipse.
		PetrinetPackage packageInstanceNet = PetrinetPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl1 qui contiendra le modele simplePDL
		ResourceSet resSet1 = new ResourceSetImpl();
				
		// Charger la ressource (notre modÃ¨le)
		URI modelURI = URI.createURI("models/SimplePDLCreator_Created_Process.xmi");
		Resource resource1 = resSet1.getResource(modelURI, true);
		
		// Créer un objet resourceSetImpl2 qui contiendra le modele PetriNet
		ResourceSet resSet2 = new ResourceSetImpl();
		
		// DÃ©finir le modèle simplepdl
		URI modelURIbis = URI.createURI("models/SimplePDL2PetriNet.xmi");
		Resource resource2 = resSet2.createResource(modelURIbis);
		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource1.getContents().get(0);
		
		// La fabrique pour fabriquer les éléments de PetriNet
		PetrinetFactory myFactory = PetrinetFactory.eINSTANCE;
		
		
		
	}
}
