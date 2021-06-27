package com.springernest.songs;

import com.springernest.SpringErnestApplication;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SongTest {

    @Test
    void songBeanTest(){
        //given
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringErnestApplication.class);

        //when
        Song song=(Song) context.getBean("prosto");

        //then
        assertThat(song.getTitle()).isEqualTo("Prosto");

    }

    @Test
    void filmSingletonScopeTest() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringErnestApplication.class);
        //when
        Song song = (Song) context.getBean("amerika");
        song.setTitle("Test");
        song = (Song) context.getBean("amerika");

        //then
        Assertions.assertThat(song.getTitle()).isEqualTo("Test");
    }

    @Test
    void filmPrototypeScopeTest() {
        //given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringErnestApplication.class);
        //when
        Song song = (Song) context.getBean("prosto");
        song.setTitle("Test");
        song = (Song) context.getBean("prosto");

        //then
        Assertions.assertThat(song.getTitle()).isEqualTo("Prosto");
    }

}