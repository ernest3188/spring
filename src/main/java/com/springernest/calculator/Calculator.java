package com.springernest.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Calculator {
    private int a;
    private int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return this.a + this.b;
    }


}
