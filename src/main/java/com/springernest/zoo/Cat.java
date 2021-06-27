package com.springernest.zoo;

import org.springframework.stereotype.Component;

@Component
public class Cat  implements Animal {
    @Override
    public String Sound() {
        return "Miau Miau";
    }
}
