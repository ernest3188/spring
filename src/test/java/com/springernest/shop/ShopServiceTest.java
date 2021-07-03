package com.springernest.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ShopServiceTest {

    @Autowired
    private ShopService shopService;

    @Test
    void buyTest() {
        //given
        Product product = new Product("kawa");
        //when
        String result = this.shopService.buy(product);
        //then
        assertThat(result).isEqualTo("bought: kawa");
    }

}