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
@Table(name="INTERVENTIONS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Intervention {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="REFERENCE",length = 6)
	private String reference;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToOne
	private Agent technicien;
	@ManyToOne
	private Batiment batiment;
	@Temporal(TemporalType.DATE)
	private Date DateItervention;
}
