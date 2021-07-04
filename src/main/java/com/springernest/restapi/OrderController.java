package com.springernest.restapi;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {


    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Order getOrder(@RequestParam int id) {

        return new Order(id, "Testowa 1/4", 12.36);
    }

    @PostMapping("create")
    public void createOrder(@RequestBody Order order){
        System.out.println(order.toString());
    }

    @PutMapping("update")
    public void updateOrder(@RequestBody Order order){
        System.out.println(order.toString());
    }

    @GetMapping( "get-all")
    public List<Order> getOrders() {
        return Arrays.asList(
                new Order(1, "Testowa 1/23", 129.9),
                new Order(2, "Testowa 2/23", 229.9),
                new Order(3, "Testowa 3/23", 329.9)
        );
    }

    @DeleteMapping("delete/{id}")
    public void deleteOrder(@PathVariable int id){
        System.out.println("Deleting order with id " + id);
    }

}

