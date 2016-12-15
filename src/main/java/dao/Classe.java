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
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classe(String nom_classe, String photo) {
		super();
		this.nom_classe = nom_classe;
		this.photo = photo;
	}
	public void setNom_classe(String nom_classe) {
		this.nom_classe = nom_classe;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public long getId_classe() {
		return id_classe;
	}
	public String getNom_classe() {
		return nom_classe;
	}
	public String getPhoto() {
		return photo;
	}
}
