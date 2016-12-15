package dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.gargoylesoftware.htmlunit.html.HtmlArea;

@Entity
public class Cours implements Serializable {
	
	@Id
	@GeneratedValue
	private long id_cours;
	private String libele;
	@Lob
	private String contenu_cours;
	private long id_exercice;
	private long id_matiere;
	private long id_classe;
	private String photo;
	private int difficulte_cours;
	
	
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cours(String libele, String contenu_cours, long id_exercice, long id_matiere, long id_classe, String photo,
			int difficulte_cours) {
		super();
		this.libele = libele;
		this.contenu_cours = contenu_cours;
		this.id_exercice = id_exercice;
		this.id_matiere = id_matiere;
		this.id_classe = id_classe;
		this.photo = photo;
		this.difficulte_cours = difficulte_cours;
	}
	public void setLibele(String libele) {
		this.libele = libele;
	}
	public void setContenu_cours(String contenu_cours) {
		this.contenu_cours = contenu_cours;
	}
	public void setId_exercice(long id_exercice) {
		this.id_exercice = id_exercice;
	}
	public void setId_matiere(long id_matiere) {
		this.id_matiere = id_matiere;
	}
	public void setId_classe(long id_classe) {
		this.id_classe = id_classe;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setDifficulte_cours(int difficulte_cours) {
		this.difficulte_cours = difficulte_cours;
	}
	public long getId_cours() {
		return id_cours;
	}
	public String getLibele() {
		return libele;
	}
	public String getContenu_cours() {
		return contenu_cours;
	}
	public long getId_exercice() {
		return id_exercice;
	}
	public long getId_matiere() {
		return id_matiere;
	}
	public long getId_classe() {
		return id_classe;
	}
	public String getPhoto() {
		return photo;
	}
	public int getDifficulte_cours() {
		return difficulte_cours;
	}
	
	
}
