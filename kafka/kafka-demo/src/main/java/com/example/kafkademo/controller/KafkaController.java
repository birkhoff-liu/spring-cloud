package com.example.kafkademo.controller;

import com.example.kafkademo.component.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawn yang
 * @version [v1.0]
 * @Description
 * @CreateDate 2020/1/21
 */
@RestController
public class KafkaController {

    @Autowired
    private KafkaSender kafkaSender;

    @PostMapping("send")
    public String send(String msg,String topic){

        Assert.notNull(msg,"消息内容不能为空");

        kafkaSender.sendMessage(topic,msg);

        return "success";
    }
}
