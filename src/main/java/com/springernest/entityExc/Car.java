package com.springernest.entityExc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Entity
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String brand;

    @Column(nullable = false, length = 30)
    private String model;

    @Column(nullable = false)
    private LocalDate productionDate;

    @Column
    private String color;

    @Column(nullable = false, updatable = false)
    private LocalDateTime creationDate;

    public Car(String brand, String model, LocalDate productionDate, String color, LocalDateTime creationDate) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.color = color;
        this.creationDate = creationDate;
    }
}
