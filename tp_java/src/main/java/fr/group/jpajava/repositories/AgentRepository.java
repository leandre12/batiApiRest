package fr.group.jpajava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.group.jpajava.entities.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {
	public List<Agent> findByNomContains(String nom);

}
