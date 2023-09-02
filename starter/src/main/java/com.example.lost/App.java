package com.example.lost;

import com.example.lost.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args)) {
            System.out.println(applicationContext.getBean(TestController.class).test());
        }
    }

}
