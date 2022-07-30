package fr.group.jpajava.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="BATIMENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Batiment {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="NOMIMMEUBLE",length = 20)
	private String nomImmeuble;	
	@Column(name="ADRESSE")
	private String adresse;
	private int nbEtage;
	private String classeEnergie; 
	@ManyToOne
	private Agent responsable;
	@Temporal(TemporalType.DATE)
	private Date DateInauguration;
		

}
