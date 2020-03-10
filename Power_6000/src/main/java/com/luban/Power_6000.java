package com.luban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class Power_6000
{

    public static void main(String[] args) {
        SpringApplication.run(Power_6000.class);
        System.out.println(2);
    }
}
