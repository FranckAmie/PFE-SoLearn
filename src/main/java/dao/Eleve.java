package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Eleve implements Serializable {
	
	@Id
	@GeneratedValue
	private long id_etudiant;
	private String nom;
	private String classe;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public long getId_etudiant() {
		return id_etudiant;
	}
	public Eleve(String nom, String classe) {
		super();
		this.nom = nom;
		this.classe = classe;
	}
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
