package com.tm.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //We don't need the SpringApplicationContext returns by the call to run
        SpringApplication.run(Application.class, args);
    }
}