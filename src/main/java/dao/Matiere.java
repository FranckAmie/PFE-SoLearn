package dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Matiere implements Serializable {
	@Id
	@GeneratedValue
	private long id_matiere;
	private String nom_matiere;
	private String photo;
	private String description ;
	private long id_classe;
	private long id_user;
	
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId_matiere() {
		return id_matiere;
	} 

	public String getNom_matiere() {
		return nom_matiere;
	}

	public void setNom_matiere(String nom_matiere) {
		this.nom_matiere = nom_matiere;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId_classe() {
		return id_classe;
	}

	public void setId_classe(long id_classe) {
		this.id_classe = id_classe;
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
		this.id_user = id_user;
	}

	public Matiere(String nom_matiere, String photo, String description, long id_classe, long id_user) {
		super();
		this.nom_matiere = nom_matiere;
		this.photo = photo;
		this.description = description;
		this.id_classe = id_classe;
		this.id_user = id_user;
	}
	
}
