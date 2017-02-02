package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IQuestionRepository extends JpaRepository<Questions, Long> {

	//Question par tag
	
	@Query("select q from Questions q where (q.tag1 like :x OR q.tag2 like :x OR q.tag3 like :x OR q.tag4 like :x) ")
	public List<Questions> questionParTag(@Param("x")String tag);
	
	@Query("select q from Questions q where q.id_user like :x ")
	public List<Questions> questionParUser(@Param("x")long id_user);
}
