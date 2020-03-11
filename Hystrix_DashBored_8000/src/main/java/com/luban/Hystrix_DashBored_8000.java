package com.luban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Hystrix_DashBored_8000
{
    public static void main(String[] args) {
        SpringApplication.run(Hystrix_DashBored_8000.class);
    }}
