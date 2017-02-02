package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Classe implements Serializable {
	@Id
	@GeneratedValue
	private long id_classe ;
	private String nom_classe;
	private String photo ;
	private long id_user;
	private String description;
	private long likes;
	public long getId_classe() {
		return id_classe;
	}
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom_classe() {
		return nom_classe;
	}

	public void setNom_classe(String nom_classe) {
		this.nom_classe = nom_classe;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
		this.id_user = id_user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public Classe(String nom_classe, String photo, long id_user, String description, long likes) {
		super();
		this.nom_classe = nom_classe;
		this.photo = photo;
		this.id_user = id_user;
		this.description = description;
		this.likes = likes;
	}

	

	

}
