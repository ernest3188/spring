package com.springernest.shop;

import org.springframework.stereotype.Service;

// Przyklad constructor injection. Preferowany sposob wstrzykiwania.
// Gdyby konstruktorow bylo wiecej trzeba jeden z nich oznaczyc @Autowired.
@Service
public class AuctionService {

    private final BuyService buyService;

    // Argumenty z uzywaniem contructor injection
    // 1. final przy polach
    // 2. mozliwosc recznego stworzenia serwisu i przekazania zaleznosci np w testach
    public AuctionService(BuyService buyService) {
        this.buyService = buyService;
    }

    public String buy(Product product) {
        return this.buyService.buyProduct(product);
    }

}
