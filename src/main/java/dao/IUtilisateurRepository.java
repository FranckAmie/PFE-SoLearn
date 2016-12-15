package dao;
import dao.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	//CONNEXION UTILISATEUR
	// LISTE DES COURS PAR CLASSE ET PAR MATIERE
		@Query("select u from Utilisateur u where u.email like :x AND u.password like :y")
		public Utilisateur connexionUser(@Param("x")String email, @Param("y")String password);
}
