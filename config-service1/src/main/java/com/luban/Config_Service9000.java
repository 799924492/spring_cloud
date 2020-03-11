package com.luban;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 */
@EnableConfigServer
@SpringBootApplication
public class Config_Service9000 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Service9000.class);
    }
}
