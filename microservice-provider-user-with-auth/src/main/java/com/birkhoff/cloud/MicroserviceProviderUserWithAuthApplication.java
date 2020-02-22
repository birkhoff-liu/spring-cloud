package com.birkhoff.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 权限认证
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceProviderUserWithAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserWithAuthApplication.class, args);
    }

}
