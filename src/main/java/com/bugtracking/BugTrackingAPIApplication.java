package com.bugtracking;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BugTrackingAPIApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(BugTrackingAPIApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BugTrackingAPIApplication.class, args);
        LOGGER.debug("Debug Message logged !!");
        LOGGER.info("info Message logged !!");
        //LOGGER.error("Error Message logged !!" ,new NullPointerException("nullError"));


    }
}
