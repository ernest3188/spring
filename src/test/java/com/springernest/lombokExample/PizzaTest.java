package com.springernest.lombokExample;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class PizzaTest {

    @Test
    void allArgsConstructorTest() {
        //given & when
        Pizza pizza = new Pizza("standard", "tomato", 32,
                Arrays.asList("becon", "mozarella", "ham", "tomato"));
        //then
        assertThat(pizza).isNotNull();
    }

    @Test
    void noArgsConstructorTest() {
        //given & when
        Pizza pizza = new Pizza();
        //then
        assertThat(pizza).isNotNull();
    }

    @Test
    void gettersTest() {
        //given
        Pizza pizza = new Pizza("standard", "tomato", 32,
                Arrays.asList("becon", "mozarella", "ham", "tomato"));
        //when & then
        assertThat(pizza.getDough()).isEqualTo("standard");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
        assertThat(pizza.getSize()).isEqualTo(32);
        assertThat(pizza.getToppings()).hasSize(4);
    }

    @Test
    void equalsTest() {
        //given
        Pizza pizza = new Pizza("standard", "tomato", 32,
                Arrays.asList("becon", "mozarella", "ham", "tomato"));
        Pizza samePizza = new Pizza("standard", "tomato", 32,
                Arrays.asList("becon", "mozarella", "ham", "tomato"));
        //when
        boolean result = pizza.equals(samePizza);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void builderTest() {
        //given & when
        Pizza pizza = Pizza.builder()
                .dough("standard")
                .sauce("tomato")
                .size(32)
                .toppings(Arrays.asList("becon", "mozarella", "ham", "tomato"))
                .build();

        //then
        assertThat(pizza).isNotNull();
    }

}