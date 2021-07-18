package com.springernest.entityExc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarDao extends CrudRepository<Car, Integer> {

    List<Car> findByBrand(String brand);

    List<Car> findByModelAndColor(String model, String color);

    void deleteAllByBrandAndModel(String brand, String model);

    List<Car> findAllByProductionDateBefore(LocalDate date);

    boolean existsByBrandAndModel(String brand, String model);

    List<Car> findAll();
}
