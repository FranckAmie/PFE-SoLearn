package dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEleves {
	
	
	
@Autowired
	private IElevesRepository eleve ;
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/ajout")
	public Eleve save(Eleve e){
		eleve.save(e);
		return e;
	}
	
	@RequestMapping("/lister")
	public List<Eleve> lister(){
		return eleve.findAll();
	}
	
	@RequestMapping("/parPage")
	public Page<Eleve> listerParPage(int page){
		
		return eleve.findAll(new PageRequest(page, 2));
	}
	
	@RequestMapping("/getEleve")
	public Eleve getEleve(long id_etudiant){
		return eleve.findOne(id_etudiant);
	}
	
	@RequestMapping("/update")
	public Eleve udateEleve(Eleve e){
		eleve.saveAndFlush(e);
		return e;
	}
	@RequestMapping("/supprimer")
	public boolean supprimer(long id_etudiant){
		eleve.delete(id_etudiant);
		return true;
	}

	@RequestMapping("/cherche")
	public List<Eleve> cherche(String mc){
		return eleve.chercheParMotCle("%"+mc+"%");
	}
	
	
	
	
	
	/*** DEBUT PARTIE DES CLASSES  ****/
	@Autowired
	IClasseRepository classe;
	@RequestMapping("/allClasses")
	public List<Classe> allClasses(){
		return classe.findAll();
	}
	
	//ADD A CLASSE
	@RequestMapping("/addClasses")
	public Classe addClasse(Classe c){
		classe.saveAndFlush(c);
		return c;
	}
	
	/*** FIN PARTIE DES CLASSES  ****/
	
	
	
	
	
	
	/*** DEBUT  PARTIE DES MATIERES  ****/
	@Autowired
	IMatiereRepository matiere;
	
	@RequestMapping("allMatieres")
	public List<Matiere> allMatieres(){
		return matiere.findAll();
	}
	
	@RequestMapping("/addMatiere")
	public Matiere addMatiere(Matiere m){
		matiere.saveAndFlush(m);
		return m;
	}
	
	@RequestMapping("/matiereParClasse")
	public List<Matiere> matiereParClasse(long id_classe){
		return matiere.matieresParClasse(id_classe);
	}
	/*** FIN PARTIE DES MATIERES  ****/
	
	
	
	
	
	/*** DEBUT  PARTIE DES COURS  ****/
	//List of all the courses
	@Autowired
	ICoursRepository cours;
	@RequestMapping("/allCours")
	public List<Cours> allcours(){
		return cours.findAll();
	}
	
	//Add a course
	@RequestMapping("/addCours")
	public Cours addCours(Cours c){
		cours.saveAndFlush(c);
		return c;
	}
	
	@RequestMapping("/coursParClasse")
	public List<Cours> coursParClasse(long id_classe){
		return cours.coursParClasse(id_classe);
	}
	
	@RequestMapping("/coursParMatiere")
	public List<Cours> coursParMatiere(long id_matiere){
		return cours.coursParMatiere(id_matiere);
	}
	
	@RequestMapping("coursParClasseEtParMatiere")
	public List<Cours> coursParClasseEtParMatiere(long id_classe, long id_matiere){
		return cours.coursParClasseEtParMatiere(id_classe, id_matiere);
	}
	
	@RequestMapping("commentaireCours")
	public List<Commentaire> commentairesCours(long id_cours){
		return cours.commentairesCours(id_cours);
	}
	/*** FIN PARTIE DES COURS  ****/
	
	
	
	
	
	/*** FIN PARTIE DES UTILISATEURS  ****/
	@Autowired
	IUtilisateurRepository user;
	
	@RequestMapping("/allUsers")
	public List<Utilisateur> allUsers(){
		return user.findAll();
	}
	@RequestMapping("addUser")
	public Utilisateur addUser(Utilisateur u){
		user.saveAndFlush(u);
		return u;
	}
	@RequestMapping("/delUser")
	public boolean delUser(long id){
		user.delete(id);
		return true;
	}
	
	@RequestMapping("/connexionUser")
	public Utilisateur connexionUser(String email, String password){
		return user.connexionUser(email, password);
	
	}
	
	@RequestMapping("/modifierUser")
	public Utilisateur modifierUser(Utilisateur u){
		user.saveAndFlush(u);
		return u;
	}
	
	@RequestMapping("ifExist")
	public boolean existance(String email, String username){
		List<Utilisateur> users = allUsers();
		for(Utilisateur u : users){
			if(u.email.equals(email)||u.username.equals(username)){
				return true;
			}
		}
		return false;
	}
	
	
	/*** FIN PARTIE DES UTILISATEURS  ****/
	
}
