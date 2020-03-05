package com.birkhoff.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderService {
    @Value("${server.port}")
    private String serverPort;

//    @Autowired
//    private ProducerConfigInfo producerConfigInfo;

    @GetMapping("/sayHello")
    @RefreshScope
    public String sayHello(){
        return "我是生产者，我的端口号为：" + serverPort ;
    }
}
