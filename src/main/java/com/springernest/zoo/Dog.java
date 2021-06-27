package com.springernest.zoo;


import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public String Sound() {
        return "Hau Hau";
    }
}
