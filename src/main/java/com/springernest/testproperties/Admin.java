package com.springernest.testproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Admin {

    private final String username;
    private final String password;

    public Admin(@Value("${app.admin.username}") String username,
                 @Value("${app.admin.password}")  String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
