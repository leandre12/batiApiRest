package fr.group.jpajava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.group.jpajava.entities.Batiment;


public interface BatimentRepository extends JpaRepository<Batiment, Long> {
	public List<Batiment> findByAdresseContains(String adresse);
}
