package dao;
import dao.*;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IElevesRepository extends JpaRepository<Eleve, Long> {
	
	@Query("select e from Eleve e where e.nom like :x")
	public List<Eleve> chercheParMotCle(@Param("x")String mc);

}
