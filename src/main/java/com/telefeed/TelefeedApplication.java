package com.telefeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

import java.util.ArrayList;

@SpringBootApplication
public class TelefeedApplication {
    public static void main(String[] args) {

        SpringApplication.run(TelefeedApplication.class, args);

    }
}
