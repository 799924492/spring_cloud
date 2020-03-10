package com.luban.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PowerController1 {
    @RequestMapping("/getPower")
    public Map getPower2(){

        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("111111","111111");
        return hashMap;
    }
}
