package com.springernest.entityGame;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameDAO extends CrudRepository<Game, Integer> {
    @Query("FROM Game g WHERE g.category=?1 and g.estimatedHours >?2")
    List<Game> findByCategoryAndEstimatedHours(String category, int estimatedHours);

    @Query(value = "Select * FROM Game g WHERE g.min_age <= ?1", nativeQuery = true)
    List<Game> findAllowedFromAge(int min);

}
