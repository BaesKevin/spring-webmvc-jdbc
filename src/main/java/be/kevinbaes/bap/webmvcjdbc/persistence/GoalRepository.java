package be.kevinbaes.bap.webmvcjdbc.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends CrudRepository<Goal, Integer> {

  @Query(value = "select * from goal limit :limit", nativeQuery = true)
  List<Goal> findAllWithLimit(int limit);
}
