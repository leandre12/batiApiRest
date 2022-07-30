package fr.group.jpajava.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="AGENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Agent {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int grade;
	private int matricule; 
	@Column(name="NOM",length = 30)
	private String nom;
	@Column(name="PRENOM",length = 20)
	private String prenom;
	@Temporal(TemporalType.DATE)	
	private Date dateNaissance;
	@Column(name="ADRESSE")
	private String adresse;
	//TODO: TypeAgent(technicien, responsable,...) 

}
