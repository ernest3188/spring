package com.springernest.shop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Przykład wstrzykiwania @Autowired przy polu.
@Service
public class ShopService {

    @Autowired
    private BuyService buyService;

    public String buy(Product product) {
        return this.buyService.buyProduct(product);
    }

}
