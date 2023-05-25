package com.ys.point.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ys.point")
public class PointAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointAdapterApplication.class, args);
    }

}
