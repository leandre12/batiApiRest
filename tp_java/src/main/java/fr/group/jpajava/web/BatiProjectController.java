package fr.group.jpajava.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.group.jpajava.entities.Agent;
import fr.group.jpajava.entities.Batiment;
import fr.group.jpajava.entities.Intervention;
import fr.group.jpajava.repositories.AgentRepository;
import fr.group.jpajava.repositories.BatimentRepository;
import fr.group.jpajava.repositories.InterventionRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BatiProjectController {
	@Autowired
	private BatimentRepository batimentRepository;
	@Autowired
	private AgentRepository agentRepository;
	@Autowired
	private InterventionRepository interventionRepository;
	
	//Liste des bâtiments
	@GetMapping("/batiments")
	public List<Batiment> batiments(){
		return batimentRepository.findAll();
	}
	
	//LIste des agents
	@GetMapping("/agents")
	public List<Agent> agents(){
		return agentRepository.findAll();
	}
	
	//LIste des interventions
	@GetMapping("/interventions")
	public List<Intervention> intervention(){
		return interventionRepository.findAll();
	}
	
	//Un batiment par son Id
	@GetMapping("/batiment/{id}")
	public Batiment batiments(@PathVariable(name="id") Long idBatiment){
		return batimentRepository.findById(idBatiment).get();
	}	
	
	//Un batiment par son Id
	@GetMapping("/agent/{id}")
	public Agent agents(@PathVariable Long id){
		return agentRepository.findById(id).get();
	}	

	//Ajouter un agent
	@PostMapping("/agents")
	public Agent saveAgent(@RequestBody Agent agent){
		return agentRepository.save(agent);
	}	
	
	//MAJ un agent
	@PutMapping("/agents/{id}")
	public Agent updateAgent(@PathVariable Long id,@RequestBody Agent agent){
		agent.setId(id);
		return agentRepository.save(agent);
	}		
	
	//Création d'une intervention
	//TODO: public int saveIntervention(null,reference,commentaire,technicien,batimentPolaris,new Date())
}
