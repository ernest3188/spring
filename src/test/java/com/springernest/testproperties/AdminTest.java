package com.springernest.testproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdminTest {

    @Autowired
    Admin admin;

    @Test
    void test(){
        System.out.println(admin.getUsername());
    }


}