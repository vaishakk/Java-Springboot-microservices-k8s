package com.assessement.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GwApplication {
    public static void main(String[] args) {
        //System.out.println("Connecting to port:" + Integer.parseInt(System.getenv("SERVICE1_PORT")));
        SpringApplication.run(GwApplication.class, args);
    }
}
