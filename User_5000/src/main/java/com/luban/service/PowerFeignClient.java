package com.luban.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-power",fallbackFactory=PowerServiceFallBack.class)
public interface PowerFeignClient {
    @RequestMapping("/getPower")
    Object getPower();
}
