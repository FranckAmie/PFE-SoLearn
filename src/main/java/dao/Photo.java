package dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Photo implements Serializable {
	@Id
	@GeneratedValue
	long id;
	String titre;

}
