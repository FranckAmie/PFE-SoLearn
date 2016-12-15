package dao;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Fiche implements Serializable {
	
	@Id
	@GeneratedValue
	long id_fiche;
	String titre_fiche;
	Date date;
	@Lob
	String contenu_fiche;
	@OneToMany
	List<Categorie_Cours> categorie_Cours;
	String photo;
	@OneToOne
	Utilisateur utilisateur;
	public long getId_fiche() {
		return id_fiche;
	}
	public String getTitre_fiche() {
		return titre_fiche;
	}
	public Date getDate() {
		return date;
	}
	public String getContenu_fiche() {
		return contenu_fiche;
	}
	public List<Categorie_Cours> getCategorie_Cours() {
		return categorie_Cours;
	}
	
	public String getPhoto() {
		return photo;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setTitre_fiche(String titre_fiche) {
		this.titre_fiche = titre_fiche;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setContenu_fiche(String contenu_fiche) {
		this.contenu_fiche = contenu_fiche;
	}
	public void setCategorie_Cours(List<Categorie_Cours> categorie_Cours) {
		this.categorie_Cours = categorie_Cours;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Fiche(String titre_fiche, Date date, String contenu_fiche, List<Categorie_Cours> categorie_Cours,
			List<CommentaireFiche> commentaires, String photo, Utilisateur utilisateur) {
		super();
		this.titre_fiche = titre_fiche;
		this.date = date;
		this.contenu_fiche = contenu_fiche;
		this.categorie_Cours = categorie_Cours;
		this.photo = photo;
		this.utilisateur = utilisateur;
	}
	public Fiche() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
