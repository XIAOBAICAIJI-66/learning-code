package com.xf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class DesignModeApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DesignModeApplication.class);
        application.run(args);
    }
}
