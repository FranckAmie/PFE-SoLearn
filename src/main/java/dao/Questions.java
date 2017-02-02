package dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.mysql.fabric.xmlrpc.base.Data;

@Entity
public class Questions implements Serializable {
	
	@Id
	@GeneratedValue
	private long id_question;
	private String titre;
	@Lob
	private String description;
	private String date; 
	private long id_user ;
	private int nb_rep;
	private String tag1;
	private String tag2;
	private String tag3;
	private String tag4;
	private int numero_rep;
	
	
	public long getId_question() {
		return id_question;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getId_user() {
		return id_user;
	}
	public void setId_user(long id_user) {
		this.id_user = id_user;
	}
	public int getNb_rep() {
		return nb_rep;
	}
	public void setNb_rep(int nb_rep) {
		this.nb_rep = nb_rep;
	}
	public String getTag1() {
		return tag1;
	}
	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}
	public String getTag2() {
		return tag2;
	}
	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}
	public String getTag3() {
		return tag3;
	}
	public void setTag3(String tag3) {
		this.tag3 = tag3;
	}
	public String getTag4() {
		return tag4;
	}
	public void setTag4(String tag4) {
		this.tag4 = tag4;
	}
	public int getNumero_rep() {
		return numero_rep;
	}
	public void setNumero_rep(int numero_rep) {
		this.numero_rep = numero_rep;
	}

	public Questions(String titre, String description, String date, long id_user, int nb_rep, String tag1, String tag2,
			String tag3, String tag4, int numero_rep) {
		super();
		this.titre = titre;
		this.description = description;
		this.date = date;
		this.id_user = id_user;
		this.nb_rep = nb_rep;
		this.tag1 = tag1;
		this.tag2 = tag2;
		this.tag3 = tag3;
		this.tag4 = tag4;
		this.numero_rep = numero_rep;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
