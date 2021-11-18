package com.example.testprf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class TestPrfApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestPrfApplication.class, args);
        for (int i = 0; i < 90000; i++) {
            System.out.println("hello world in time-" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
