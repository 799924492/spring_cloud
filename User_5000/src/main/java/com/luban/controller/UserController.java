package com.luban.controller;

import com.luban.service.PowerFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    static String url = "http://service-power";
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    PowerFeignClient powerFeignClient;

    @RequestMapping("/getUser")
    public String getUser() {
        return "aaa";
    }

    @RequestMapping("/getPower")
    @HystrixCommand(fallbackMethod="fallbackMethod")
    public Object getPower() {
        Object forObject = restTemplate.getForObject(url + "/getPower", Object.class);
        return forObject;
    }
    public Object fallbackMethod() {

        return "系统繁忙";
    }

    @RequestMapping("/getFeignPower")
    public Object getFeignPower() {

        return powerFeignClient.getPower();
    }
}
