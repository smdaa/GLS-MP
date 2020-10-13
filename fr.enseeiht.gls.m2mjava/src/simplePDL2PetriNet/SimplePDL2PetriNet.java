package simplePDL2PetriNet;

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
				
		// Charger la ressource (notre modéle)
		URI modelURI = URI.createURI("models/Process-exemple.xmi");
		Resource resource1 = resSet1.getResource(modelURI, true);
		
		// Créer un objet resourceSetImpl2 qui contiendra le modele PetriNet
		ResourceSet resSet2 = new ResourceSetImpl();
		
		// Définir le modèle simplepdl
		URI modelURIbis = URI.createURI("models/ConvertedProcess-exemple.xmi");
		Resource resource2 = resSet2.createResource(modelURIbis);
		
		// Récupérer le premier élément du modéle (élément racine)
		Process process = (Process) resource1.getContents().get(0);
		
		// La fabrique pour fabriquer les éléments de PetriNet
		PetrinetFactory myFactory = PetrinetFactory.eINSTANCE;
		
		//créer une petriNet
		PetriNet petrinet = myFactory.createPetriNet();
		
		// on nome le reseau petri
		petrinet.setName(process.getName());
		
		resource2.getContents().add(petrinet);
		
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				
				// on crée 3 places NotStarted Started Finished
				Place WD_NotStarted = myFactory.createPlace();
				Place WD_Running = myFactory.createPlace();
				Place WD_Finished = myFactory.createPlace();
				
				WD_NotStarted.setName(((WorkDefinition) o).getName() + "_NotStarted");
				WD_Running.setName(((WorkDefinition) o).getName() + "_Running");
				WD_Finished.setName(((WorkDefinition) o).getName() + "_Finished");
				
				// on crée 2 transitions WD_Start WD_Finish
				Transition WD_Start = myFactory.createTransition();
				Transition WD_Finish = myFactory.createTransition();
				
				WD_Start.setName(((WorkDefinition) o).getName() + "_Start");
				WD_Finish.setName(((WorkDefinition) o).getName() + "_Finish");
				
				// on crée quatre arcs qui relais les places aves les transitions
				Arc NotStarted2Start = myFactory.createArc();
				Arc Start2Running = myFactory.createArc();
				Arc Running2Finish = myFactory.createArc();
				Arc Finish2Finished = myFactory.createArc();
				
				NotStarted2Start.setWeight(1);
				Start2Running.setWeight(1);
				Running2Finish.setWeight(1);
				Finish2Finished.setWeight(1);
				
				NotStarted2Start.setType(TypeOfArc.NORMAL);
				Start2Running.setType(TypeOfArc.NORMAL);
				Running2Finish.setType(TypeOfArc.NORMAL);
				Finish2Finished.setType(TypeOfArc.NORMAL);
				
				NotStarted2Start.setFrom(WD_NotStarted);
				NotStarted2Start.setTo(WD_Start);
				
				Start2Running.setFrom(WD_Start);
				Start2Running.setTo(WD_Running);
				
				Running2Finish.setFrom(WD_Running);
				Running2Finish.setTo(WD_Finish);
				
				Finish2Finished.setFrom(WD_Finish);
				Finish2Finished.setTo(WD_Finished);
					
				
				
				
			} else if (o instanceof WorkSequence) {
				
				Arc arc_name = myFactory.createArc();
				arc_name.setType(TypeOfArc.READ_ARC);
				arc_name.setWeight(1);
				
				if (((WorkSequence) o).getLinkType() == WorkSequenceType.FINISH_TO_START) {
					
					
				} else if (((WorkSequence) o).getLinkType() == WorkSequenceType.FINISH_TO_START) {
					
					
				} else if (((WorkSequence) o).getLinkType() == WorkSequenceType.START_TO_FINISH) {
					
					
				} else {
					
					
				}
				
				
				
				
			} else if (o instanceof Ressource) {
				
			} else if (o instanceof Ressource_Usage) {
				
			}
		}
		
		
		
		
		
		
		
	}
}
