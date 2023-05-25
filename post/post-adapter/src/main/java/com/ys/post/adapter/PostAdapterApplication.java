package com.ys.post.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ys.post")
public class PostAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostAdapterApplication.class, args);
    }

}
