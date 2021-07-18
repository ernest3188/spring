package com.springernest.entityGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class GameDAOTest {


    @Autowired
    GameDAO gameDAO;

    private List<Game> list;

    @BeforeEach
    void setUp() {
        list = Arrays.asList(
                new Game("League of Legends", "MOBA", null, 12, LocalDate.of(2009, 10, 6)),
                new Game("Cyberpunk 2077", "RPG", 100, 18, LocalDate.of(2020, 12, 10)),
                new Game("Grand Theft Auto V", "TPP", 78, 18, LocalDate.of(2015, 04, 14)),
                new Game("Wiedźmin 3: Dziki Gon", "TPP", 172, 12, LocalDate.of(2015, 05, 19)));


    }

    @Test
    void shouldRetrieveGameByCategoryAndTime() {

        //given
        this.gameDAO.saveAll(list);
        //when
        List<Game> result = gameDAO.findByCategoryAndEstimatedHours("TPP", 90);

        //then
        assertThat(result).hasSize(1);

    }

    @Test
    void shouldRetrieveGameByAge(){

        //given
        this.gameDAO.saveAll(list);

        //when
        List<Game> result=gameDAO.findAllowedFromAge(12);

        //then
        assertThat(result).hasSize(2);

    }
}


