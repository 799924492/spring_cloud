package com.luban.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class PowerServiceFallBack  implements FallbackFactory<PowerFeignClient> {

    @Override
    public PowerFeignClient create(Throwable throwable) {
        return new PowerFeignClient() {
            @Override
            public Object getPower() {
                System.out.println("执行getDepartById()的服务降级处理方法");
                return "aaaa";
            }
        };
    }
}
