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
	private String description;
	private String abreviation;
	private String ecole ;
	private int like_cours;
	private int commentaires;
	
	
	public int getLike_cours() {
		return like_cours;
	}

	public void setLike_cours(int like_cours) {
		this.like_cours = like_cours;
	}

	public long getId_cours() {
		return id_cours;
	}
	
	public String getLibele() {
		return libele;
	}
	public void setLibele(String libele) {
		this.libele = libele;
	}
	public String getContenu_cours() {
		return contenu_cours;
	}
	public void setContenu_cours(String contenu_cours) {
		this.contenu_cours = contenu_cours;
	}
	public long getId_exercice() {
		return id_exercice;
	}
	public void setId_exercice(long id_exercice) {
		this.id_exercice = id_exercice;
	}
	public long getId_matiere() {
		return id_matiere;
	}
	public void setId_matiere(long id_matiere) {
		this.id_matiere = id_matiere;
	}
	public long getId_classe() {
		return id_classe;
	}
	public void setId_classe(long id_classe) {
		this.id_classe = id_classe;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getDifficulte_cours() {
		return difficulte_cours;
	}
	public void setDifficulte_cours(int difficulte_cours) {
		this.difficulte_cours = difficulte_cours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	
	public int getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(int commentaires) {
		this.commentaires = commentaires;
	}

	public Cours(String libele, String contenu_cours, long id_exercice, long id_matiere, long id_classe, String photo,
			int difficulte_cours, String description, String abreviation, String ecole, int like_cours, int commentaires) {
		super();
		this.libele = libele;
		this.contenu_cours = contenu_cours;
		this.id_exercice = id_exercice;
		this.id_matiere = id_matiere;
		this.id_classe = id_classe;
		this.photo = photo;
		this.difficulte_cours = difficulte_cours;
		this.description = description;
		this.abreviation = abreviation;
		this.ecole = ecole;
		this.like_cours = like_cours;
		this.commentaires = commentaires;
	}

	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
}
