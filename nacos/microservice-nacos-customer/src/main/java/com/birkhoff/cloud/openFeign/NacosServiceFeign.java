package com.birkhoff.cloud.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-service")
public interface NacosServiceFeign {

    @GetMapping("sayHello")
    String sayHello();
}
