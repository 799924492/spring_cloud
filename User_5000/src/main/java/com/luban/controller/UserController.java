package com.luban.controller;

import com.luban.service.PowerFeignClient;
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
    public Object getPower() {
        Object forObject = restTemplate.getForObject(url + "/getPower", Object.class);
        return forObject;
    }

    @RequestMapping("/getFeignPower")
    public Object getFeignPower() {

        return powerFeignClient.getPower();
    }
}
