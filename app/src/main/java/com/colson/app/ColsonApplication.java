package com.colson.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangwg
 */
@SpringBootApplication(scanBasePackages = "com.colson.app")
public class ColsonApplication{
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ColsonApplication.class);
        app.run(args);
    }
}
