package fr.group.jpajava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.group.jpajava.entities.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
	public List<Intervention> findByReference(String reference);

}
