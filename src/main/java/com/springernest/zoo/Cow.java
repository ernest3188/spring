package com.springernest.zoo;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {
    @Override
    public String Sound() {
        return "Muuuu";
    }
}
