package com.birkhoff.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
/***开启openfeign客户端*/
@EnableFeignClients
public class NacosCustomerServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(NacosCustomerServiceApplication.class, args);
  }
}
