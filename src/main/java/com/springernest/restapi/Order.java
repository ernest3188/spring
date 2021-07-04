package com.springernest.restapi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString


public class Order {
    private int id;
    private String address;
    private double price;
}
