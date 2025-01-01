package com.example.kafkademo.component;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 消息接收
 * @author shawn yang
 * @version [v1.0]
 * @Description
 * @CreateDate 2020/1/21
 */
@Component
@Slf4j
public class KafkaConsumer {

    /**
     * containerFactory:定义批处理器，批处理消费的线程数由kafka.listener.concurrencys控制
     * topics：消费的消息队列的topic
     * @param records
     * @param ack
     */
    @KafkaListener(containerFactory = "kafkaBatchListener",topics = {"haier"})
    public void batchListener1(List<ConsumerRecord<?,?>> records, Acknowledgment ack){

        try {
            records.forEach(record -> {

                //TODO - 处理消息
                log.info("receive {} msg:{}",record.topic(),record.value().toString());

            });
        } catch (Exception e) {

            //TODO - 消息处理异常操作
            log.error("kafka listen error:{}",e.getMessage());

        } finally {
            //手动提交偏移量
            ack.acknowledge();
        }

    }

    /**
     * containerFactory:定义批处理器，批处理消费的线程数由kafka.listener.concurrencys控制
     * topics：消费的消息队列的topic
     * @param records
     * @param ack
     */
    @KafkaListener(containerFactory = "kafkaBatchListener",topics = {"hello"})
    public void batchListener2(List<ConsumerRecord<?,?>> records, Acknowledgment ack){

        try {
            records.forEach(record -> {

                //TODO - 处理消息
                log.info("receive {} msg:{}",record.topic(),record.value().toString());

            });
        } catch (Exception e) {

            //TODO - 消息处理异常操作
            log.error("kafka listen error:{}",e.getMessage());

        } finally {
            //手动提交偏移量
            ack.acknowledge();
        }

    }




}
