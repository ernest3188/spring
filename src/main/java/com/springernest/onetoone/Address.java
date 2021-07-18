package com.springernest.onetoone;

import lombok.Getter;

import javax.persistence.*;
@Table(name = "address")
@Entity
@Getter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String city;

    @Column
    private String street;

    @Column
    private String buildingNumber;

    @Column
    private String flatNumber;

    @OneToOne(mappedBy = "address")
    private User user;
}
