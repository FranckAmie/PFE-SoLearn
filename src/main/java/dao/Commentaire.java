package dao;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Commentaire implements Serializable {
	@Id
	@GeneratedValue
	long id_commentaire;
	String libele_commentaire;
	Date date;
	String contenu_commentaire;
	@OneToOne
	Utilisateur utilisateur;
	long id_cours;
	public long getId_commentaire() {
		return id_commentaire;
	}
	public String getLibele_commentaire() {
		return libele_commentaire;
	}
	public Date getDate() {
		return date;
	}
	public String getContenu_commentaire() {
		return contenu_commentaire;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public long getId_cours() {
		return id_cours;
	}
	public void setLibele_commentaire(String libele_commentaire) {
		this.libele_commentaire = libele_commentaire;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setContenu_commentaire(String contenu_commentaire) {
		this.contenu_commentaire = contenu_commentaire;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public void setId_cours(long id_cours) {
		this.id_cours = id_cours;
	}
	public Commentaire(String libele_commentaire, Date date, String contenu_commentaire, Utilisateur utilisateur,
			long id_cours) {
		super();
		this.libele_commentaire = libele_commentaire;
		this.date = date;
		this.contenu_commentaire = contenu_commentaire;
		this.utilisateur = utilisateur;
		this.id_cours = id_cours;
	}
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
}
