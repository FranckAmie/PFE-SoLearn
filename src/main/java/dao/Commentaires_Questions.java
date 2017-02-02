package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commentaires_Questions implements Serializable {
	
	@Id
	@GeneratedValue
	private long id_commentaire;
	private long id_question;
	private int solution;
	private String contenu;
	private int id_user;
	private String username;
	private String date;
	public long getId_commentaire() {
		return id_commentaire;
	}
	
	public long getId_question() {
		return id_question;
	}
	public void setId_question(long id_question) {
		this.id_question = id_question;
	}
	public int getSolution() {
		return solution;
	}
	public void setSolution(int solution) {
		this.solution = solution;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Commentaires_Questions(long id_question, int solution, String contenu, int id_user, String username,
			String date) {
		super();
		this.id_question = id_question;
		this.solution = solution;
		this.contenu = contenu;
		this.id_user = id_user;
		this.username = username;
		this.date = date;
	}

	public Commentaires_Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
