package com.springernest.entityExample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonDaoTest {

    @Autowired
    PersonDao personDao;
    private List<Person> list;

    @BeforeEach
    void setUp() {
        list = Arrays.asList(
                new Person("Michal", "Chmielewski", 13, LocalDateTime.now()),
                new Person("Jakub", "Kowalski", 25, LocalDateTime.now()),
                new Person("Adam", "Kowalski", 20, LocalDateTime.now()),
                new Person("Ewa", "Kowalska", 15, LocalDateTime.now()),
                new Person("Ernest", "Smoliński", 32, LocalDateTime.now())
        );
    }

    @Test
    void shouldAddPerson() {
        //given
        Person person = new Person("Ernest", "Smolinski", null,
                LocalDateTime.now());
        //when
        this.personDao.save(person);

        Person result = this.personDao.findById(person.getId())
                .orElse(null);

        assertThat(result).isNotNull();

        this.personDao.delete(result);
    }

    @Test
    void shouldRetrievePersonByLastname() {
        //given
       // Person person = new Person("Michal", "Chmielewski", null, LocalDateTime.now());

        this.personDao.saveAll(list);

        //when

        List<Person> result = this.personDao.findBySurname("Kowalski");
        //cleanUp
        this.personDao.deleteAll(list);

        //then
        assertThat(result).hasSize(2);

    }

}

