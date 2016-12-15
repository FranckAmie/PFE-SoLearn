package dao;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Exercices implements Serializable {
	@Id
	@GeneratedValue
	long id_exo;
	String titre;
	@Lob
	String contenu_exercice;
	@Lob
	String corrige;
	long id_cours, id_classe, id_matiere;
	int difficulte_exercice;
	
}
