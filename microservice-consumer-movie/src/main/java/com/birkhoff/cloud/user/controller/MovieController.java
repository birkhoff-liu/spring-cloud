package com.birkhoff.cloud.user.controller;

import com.birkhoff.cloud.user.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
//        ServiceInstance instance = discoveryClient.getServices();
//        LOGGER.info("host :" + instance.getHost() + ", service_id : " + discoveryClient.getServices().get(0));
        return this.restTemplate.getForObject(userServiceUrl + id, User.class);
    }

}