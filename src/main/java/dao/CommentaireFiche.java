package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CommentaireFiche implements Serializable {
@Id
@GeneratedValue
long id_com_fiche;
String contenu;
@OneToOne
Utilisateur user;

@OneToOne
Fiche fiche;
public void setUser(Utilisateur user) {
	this.user = user;
}
public void setFiche(Fiche fiche) {
	this.fiche = fiche;
}
public Utilisateur getUser() {
	return user;
}
public Fiche getFiche() {
	return fiche;
}
public long getId_com_fiche() {
	return id_com_fiche;
}
public String getContenu() {
	return contenu;
}
public Utilisateur getId_user() {
	return user;
}
public CommentaireFiche(String contenu, Utilisateur user, Fiche fiche) {
	super();
	this.contenu = contenu;
	this.user = user;
	this.fiche = fiche;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
public void setId_user(Utilisateur user) {
	this.user = user;
}
public CommentaireFiche(String contenu, Utilisateur user) {
	super();
	this.contenu = contenu;
	this.user = user;
}
public CommentaireFiche() {
	super();
	
}

}
