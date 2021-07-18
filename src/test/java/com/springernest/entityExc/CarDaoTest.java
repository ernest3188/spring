package com.springernest.entityExc;

import com.springernest.entityExample.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CarDaoTest {

    @Autowired
    CarDao carDao;

    private List<Car> list;

    @BeforeEach
    void setUp() {
        list = Arrays.asList(
                new Car("Toyota", "Auris", LocalDate.of(2011, 1, 1), "silver", LocalDateTime.now()),
                new Car("Toyota", "Auris", LocalDate.of(2011, 1, 1), "red", LocalDateTime.now()),
                new Car("Honda", "Accord", LocalDate.of(2004, 1, 1), "blue", LocalDateTime.now()),
                new Car("Honda", "Accord", LocalDate.of(2004, 1, 1), "blue", LocalDateTime.now()));

    }


    @Test
    void shouldCarAdd() {
        //given
        Car car = new Car("Toyota", "Auris",
                LocalDate.of(2011, 05, 11), null, LocalDateTime.now());
        //when
        this.carDao.save(car);
    }

    @Test
    void shouldRetrieveCarByBrand() {
        //given


        this.carDao.saveAll(list);

        //when
        List<Car> result = this.carDao.findByBrand("Toyota");
        //cleanUp
        this.carDao.deleteAll(list);

        //then
        assertThat(result).hasSize(2);

    }

    @Test
    void shouldRetrieveCarByModelColor() {
        //given

        this.carDao.saveAll(list);

        //when
        List<Car> result = this.carDao.findByModelAndColor("Auris", "red");
        //cleanUp
        this.carDao.deleteAll(list);

        //then
        assertThat(result).hasSize(1);

    }


    @Test
    void shouldDeleteByBrandAndModel() {
        //given
        this.carDao.saveAll(list);

        //when
        this.carDao.deleteAllByBrandAndModel("Honda", "Accord");
        //List<Car> result = this.carDao.findAll();
        List<Car> result= this.carDao.findAll();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldRetrieveCarsByProductionYearBefore() {
        //given
        this.carDao.saveAll(list);

        //when
        List<Car> result = this.carDao.findAllByProductionDateBefore(LocalDate.of(2009, 1, 1));

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldReturnTrueWhenCarExistInDatabase() {
        //given
        this.carDao.saveAll(list);

        //when
        Integer firstCarId = list.get(0).getId();
        boolean result = this.carDao.existsById(firstCarId);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrueWhenCarExistInDatabaseByBrandAndModel() {
        //given
        this.carDao.saveAll(list);

        //when
        boolean result = this.carDao.existsByBrandAndModel("Honda", "Accord");

        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseWhenCarDoesntExistInDatabaseByBrandAndModel() {
        //given
        this.carDao.saveAll(list);

        //when
        boolean result = this.carDao.existsByBrandAndModel("Fiat", "Punto");

        //then
        assertThat(result).isFalse();
    }
}