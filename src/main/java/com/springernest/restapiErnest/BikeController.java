package com.springernest.restapiErnest;


import com.springernest.restapi.Order;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("bike")
public class BikeController {

   // @RequestMapping(value = "get", method = RequestMethod.GET)
    @GetMapping("get")
    public Bike getBike(String make) {
        System.out.println("Ktos tu szpera "+ LocalDateTime.now().toLocalTime());
        return new Bike(make, "YZF");
    }

    @PostMapping("create")
    public void createBike(@RequestBody Bike bike){
        System.out.println(bike.toString());
    }




    @DeleteMapping("delete/{make}")
    public void deleteBike(@PathVariable String make){
        System.out.println("Deleting bike: " + make);
    }
}
