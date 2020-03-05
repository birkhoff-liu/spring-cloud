package com.birkhoff.cloud.controller;

import com.birkhoff.cloud.openFeign.NacosServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosCustomerService {
    @Autowired
    private NacosServiceFeign nacosServiceFeign;

    @GetMapping("/getTestResult")
    public String getTestResult() {
        String result = nacosServiceFeign.sayHello();
        return "我是消费者，通过ribbon负载均衡调用sevice返回结果:" + result;
    }
}
