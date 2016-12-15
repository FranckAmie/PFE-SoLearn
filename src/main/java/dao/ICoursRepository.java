package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICoursRepository extends JpaRepository<Cours, Long> {
	
	// LISTE DES COURS PAR MATIERE
	@Query("select c from Cours c where c.id_matiere like :x")
	public List<Cours> coursParMatiere(@Param("x")long id_matiere);
	
	// LISTE DES COURS PAR CLASSE
	@Query("select c from Cours c where c.id_classe like :x")
	public List<Cours> coursParClasse(@Param("x")long id_classe);
	
	// LISTE DES COURS PAR CLASSE ET PAR MATIERE
	@Query("select c from Cours c where c.id_classe like :x AND c.id_matiere like :y")
	public List<Cours> coursParClasseEtParMatiere(@Param("x")long id_classe, @Param("y")long id_matiere);
	
	@Query("select c from Commentaire c where c.id_cours like :x")
	public List<Commentaire> commentairesCours(@Param("x")long id_cours);
	
}
