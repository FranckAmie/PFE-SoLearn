package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public class Categorie_Cours implements Serializable {
	
	@Id
	@GeneratedValue
	long id_cat_cours;
	String nom_cat_cours;
	@OneToOne
	Photo photo;
	

}
