package com.example.kafkademo.component;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * 消息发送
 * @author shawn yang
 * @version [v1.0]
 * @Description
 * @CreateDate 2020/1/21
 */
@Component
@Slf4j
public class KafkaSender {

    private final KafkaTemplate<String, String> KAFKA_TEMPLATE;

    @Autowired
    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.KAFKA_TEMPLATE = kafkaTemplate;
    }

    public void sendMessage(String topic, String message) {
        log.info("Send msg:{}", message);

        ListenableFuture<SendResult<String, String>> sender = KAFKA_TEMPLATE.send(new ProducerRecord<>(topic, message));

        sender.addCallback(
                result -> log.info("Send success:offset({}),partition({}),topic({})",
                        result.getRecordMetadata().offset(),
                        result.getRecordMetadata().partition(),
                        result.getRecordMetadata().topic()),
                ex -> log.error("Send fail:{}", ex.getMessage()));
    }
}
