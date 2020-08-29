package com.telefeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class TelefeedApplication {
    public static void main(String[] args) {
        SpringApplication.run(TelefeedApplication.class, args);
        ArrayList<Object> list = new ArrayList<>();
    }
}
