package com.springernest.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AuctionServiceTest {

    @Autowired
    private AuctionService auctionService;

    @Test
    void buyTest() {
        //given
        Product product = new Product("kawa");
        //when
        String result = this.auctionService.buy(product);
        //then
        assertThat(result).isEqualTo("bought: kawa");
    }


}