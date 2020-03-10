package com.luban.service;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-power")
public interface PowerFeignClient {
    @RequestMapping("/getPower")
    Object getPower();
}
