package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue
	long id;
	String email;
	String username;
	String password;
	int categorie;
	String photo;
	public long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getCategorie() {
		return categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public Utilisateur(String email, String username, String password, int categorie, String photo) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.categorie = categorie;
		this.photo = photo;
	}
	public Utilisateur() {
		super();
	}
	
	
	

}
