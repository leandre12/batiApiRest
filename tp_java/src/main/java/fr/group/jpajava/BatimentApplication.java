package fr.group.jpajava;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.group.jpajava.entities.Agent;
import fr.group.jpajava.entities.Batiment;
import fr.group.jpajava.entities.Intervention;
import fr.group.jpajava.repositories.BatimentRepository;
import fr.group.jpajava.repositories.AgentRepository;
import fr.group.jpajava.repositories.InterventionRepository;

/**
* Programme Java pour la gestion des bâtiments publics, agents et interventions des techniciens
* SpringBoot, Maven, JPA
* @author  Léandre ANDRIANIAINA
* @version 1.0 
* @since   2022-30-07
*
**/

@SpringBootApplication
public class BatimentApplication implements CommandLineRunner{

	@Autowired
	private  BatimentRepository batimentRepository;
	@Autowired
	private  AgentRepository agentRepository;
	@Autowired
	private  InterventionRepository interventionRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BatimentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Inititialisation des données pour la demo
		 */
		
		Agent responsable = new Agent(null, 200, 60366, "BLANCHARD", "Léon", new Date(), "32 rue du petit village St Herblain");
		agentRepository.save(responsable);
		Agent technicien = new Agent(null, 200, 60366, "OGER", "CLélie", new Date(), "30 rue du petit village St Herblain");
		agentRepository.save(technicien);
		
		Batiment batimentPolaris = batimentRepository.save(new Batiment(null,"POLARIS", "8 bd Vincent Gâche",7,"E",responsable,new Date()));
		Batiment batimentTripode = batimentRepository.save(new Batiment(null,"TRIPODE", "1 bd Vincent Gâche",6,"E",responsable,new Date()));
		
		Intervention intervention = interventionRepository.save(new Intervention(null,"POL001","Intervention sur l'ascenseur 2",technicien,batimentPolaris,new Date()));

	}

}