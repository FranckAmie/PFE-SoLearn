package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICommentaires_Questions extends JpaRepository<Commentaires_Questions, Long> {

	
	@Query("select c from Commentaires_Questions c where (c.id_question like :x ) ")
	public List<Commentaires_Questions> commentaire_question(@Param("x")long id_question);
}
