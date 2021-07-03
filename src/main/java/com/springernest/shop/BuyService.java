package com.springernest.shop;

import org.springframework.stereotype.Service;

@Service
public class BuyService {

    public String buyProduct(Product product) {

        return "bought: " + product.getName();
    }

}
