package com.springernest.zoo;

import com.springernest.SpringErnestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalTestSuite {

    @Test
    void catBeanTests() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringErnestApplication.class);
        //when

        Cat cat = context.getBean(Cat.class);
        //then
        assertThat(cat.Sound()).isEqualTo("Miau Miau");
    }

    @Test
    void dogBeanTests() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringErnestApplication.class);
        //when

        Dog dog = context.getBean(Dog.class);
        //then
        assertThat(dog.Sound()).isEqualTo("Hau Hau");
    }

    @Test
    void cowBeanTests() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringErnestApplication.class);
        //when

        Cow cow = context.getBean(Cow.class);
        //then
        assertThat(cow.Sound()).isEqualTo("Muuuu");
    }
}