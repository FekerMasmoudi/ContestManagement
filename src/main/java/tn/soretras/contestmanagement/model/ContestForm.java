package tn.soretras.contestmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table

public class ContestForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="idcontest", referencedColumnName="id")
	private Contest contest;
	@ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="iduser", referencedColumnName="id")
	private User user;
	

}
