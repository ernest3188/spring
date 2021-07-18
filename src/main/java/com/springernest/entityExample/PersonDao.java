package com.springernest.entityExample;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {

    List<Person> findBySurname(String surname);

    @Query("FROM Person p WHERE p.firstName='Ernest'")
    List<Person>findAllErnests();


    @Query("FROM Person p WHERE p.firstName = 'Michal'")
    List<Person> findAllMichals();

    @Query(value = "SELECT * FROM PERSON p WHERE p.first_name = 'Michal'", nativeQuery = true)
    List<Person> findAllMichalsNative();

    @Query("FROM Person p WHERE p.age > :min")
    List<Person> findOlderThan(int min);

    @Query(value = "SELECT * FROM PERSON p WHERE p.first_name = ?1 AND p.last_name = ?2", nativeQuery = true)
    List<Person> findByFirstNameAndLastNameNative(String firstName, String listName);
}
