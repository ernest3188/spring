package com.springernest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringErnestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringErnestApplication.class, args);
    }

}
