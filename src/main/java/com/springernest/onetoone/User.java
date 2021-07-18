package com.springernest.onetoone;

import lombok.Getter;

import javax.persistence.*;
@Table(name = "user")
@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;

    @OneToOne
    @JoinColumn(name = "address_fk",referencedColumnName = "id", unique = true)
    private Address address;
}
