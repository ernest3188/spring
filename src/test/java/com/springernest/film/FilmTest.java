package com.springernest.film;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;



@SpringBootTest
class FilmTest {

    @Test
    void filmBeanTest(){
        //given
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Film.class);
        //when
        Film film=(Film) context.getBean("matrix");

        //then
        assertThat(film.getTitle()).isEqualTo("Matrix");
    }


}