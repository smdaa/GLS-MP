package simplePDL2PetriNet;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
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
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		// Charger le package SimplePDL afin de l'enregistrer dans le registre
		// d'Eclipse.
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
		if (args.length == 1) {
			modelURI = URI.createURI("models/" + args[0]);
		}
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

		// créer une petriNet
		PetriNet petrinet = myFactory.createPetriNet();

		// on nome le reseau petri
		petrinet.setName(process.getName());

		resource2.getContents().add(petrinet);

		// hash map pour un recherche efficace
		Map<String, Place> places = new HashMap<String, Place>();
		Map<String, Transition> transitions = new HashMap<String, Transition>();

		
		// convertir les workdefenitions
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {

				// on crée 4 places NotStarted Started Running et Finished
				Place wd_ready = myFactory.createPlace();
				Place wd_started = myFactory.createPlace();
				Place wd_running = myFactory.createPlace();
				Place wd_finished = myFactory.createPlace();

				wd_ready.setName(((WorkDefinition) o).getName() + "_ready");
				wd_started.setName(((WorkDefinition) o).getName() + "_started");
				wd_running.setName(((WorkDefinition) o).getName() + "_running");
				wd_finished.setName(((WorkDefinition) o).getName() + "_finished");

				places.put(wd_finished.getName(), wd_finished);
				places.put(wd_started.getName(), wd_started);

				petrinet.getElement().add(wd_ready);
				petrinet.getElement().add(wd_started);
				petrinet.getElement().add(wd_running);
				petrinet.getElement().add(wd_finished);

				// on crée 2 transitions WD_Start WD_Finish
				Transition wd_start = myFactory.createTransition();
				Transition wd_finish = myFactory.createTransition();

				wd_start.setName(((WorkDefinition) o).getName() + "_start");
				wd_finish.setName(((WorkDefinition) o).getName() + "_finish");

				transitions.put(wd_start.getName(), wd_start);
				transitions.put(wd_finish.getName(), wd_finish);

				petrinet.getElement().add(wd_start);
				petrinet.getElement().add(wd_finish);

				// on crée cinq arcs qui relais les places aves les transitions
				Arc ready2start = myFactory.createArc();
				Arc start2running = myFactory.createArc();
				Arc start2started = myFactory.createArc();
				Arc running2finish = myFactory.createArc();
				Arc finish2finished = myFactory.createArc();

				ready2start.setWeight(1);
				start2started.setWeight(1);
				start2running.setWeight(1);
				running2finish.setWeight(1);
				finish2finished.setWeight(1);

				ready2start.setType(TypeOfArc.NORMAL);
				start2started.setType(TypeOfArc.NORMAL);
				start2running.setType(TypeOfArc.NORMAL);
				running2finish.setType(TypeOfArc.NORMAL);
				finish2finished.setType(TypeOfArc.NORMAL);

				ready2start.setFrom(wd_ready);
				ready2start.setTo(wd_start);

				start2started.setFrom(wd_start);
				start2started.setTo(wd_started);

				start2running.setFrom(wd_start);
				start2running.setTo(wd_running);

				running2finish.setFrom(wd_running);
				running2finish.setTo(wd_finish);

				finish2finished.setFrom(wd_finish);
				finish2finished.setTo(wd_finished);

				petrinet.getElement().add(ready2start);
				petrinet.getElement().add(start2started);
				petrinet.getElement().add(start2running);
				petrinet.getElement().add(running2finish);
				petrinet.getElement().add(finish2finished);

			}
		}
		
		System.out.println("WD__OK");
		
		// convertir les  WorkSequences
		for (Object o : process.getProcessElements()) {
			if(o instanceof WorkSequence) {
				Arc ws_con = myFactory.createArc();
				ws_con.setType(TypeOfArc.READ_ARC);
				
				if (((WorkSequence) o).getLinkType() == WorkSequenceType.START_TO_START) {
					ws_con.setFrom(places.get(((WorkSequence) o).getPredecessor().getName() + "_started"));
					ws_con.setTo(transitions.get(((WorkSequence) o).getSuccessor().getName() + "_start"));
				} else if (((WorkSequence) o).getLinkType() == WorkSequenceType.START_TO_FINISH) {
					ws_con.setFrom(places.get(((WorkSequence) o).getPredecessor().getName() + "_started"));
					ws_con.setTo(transitions.get(((WorkSequence) o).getSuccessor().getName() + "_finish"));
				} else if (((WorkSequence) o).getLinkType() == WorkSequenceType.FINISH_TO_START) {
					ws_con.setFrom(places.get(((WorkSequence) o).getPredecessor().getName() + "_finished"));
					ws_con.setTo(transitions.get(((WorkSequence) o).getSuccessor().getName() + "_start"));
				} else if (((WorkSequence) o).getLinkType() == WorkSequenceType.FINISH_TO_FINISH) {
					ws_con.setFrom(places.get(((WorkSequence) o).getPredecessor().getName() + "_finished"));
					ws_con.setTo(transitions.get(((WorkSequence) o).getSuccessor().getName() + "_finish"));
				}
				
				petrinet.getElement().add(ws_con);
			}
		}
		
		System.out.println("WS__OK");
		
		// Sauver la ressource
		try {
			resource2.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
