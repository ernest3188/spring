package com.springernest.film;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmConfiguration {
    @Bean
    public Film matrix() {
        return new Film("Matrix", 120);
    }

    @Bean
    public Film troja() {
        return new Film("Troja", 120);
    }

    @Bean("Lotr") //można sobie nazwać beana
    public Film returnKing() {
        return new Film("Return of The King", 255);
    }

}
