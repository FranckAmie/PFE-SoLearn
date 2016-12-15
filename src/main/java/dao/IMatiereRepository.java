package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMatiereRepository extends JpaRepository<Matiere, Long> {
	
	@Query("select m from Matiere m where m.id_classe like :x")
	public List<Matiere> matieresParClasse(@Param("x")long id_classe);

	

}
