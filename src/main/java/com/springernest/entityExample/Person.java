package com.springernest.entityExample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(name="last_name", length = 50, nullable = false)
    private String surname;

    @Column
    private Integer age;

    @Column(nullable = false, updatable = false)
    private LocalDateTime creationDate;

    public Person( String firstName, String surname, Integer age, LocalDateTime creationDate) {

        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.creationDate = creationDate;
    }
}
