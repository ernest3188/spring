package com.springernest.entityExample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {

    List<Person> findBySurname(String surname);
}
