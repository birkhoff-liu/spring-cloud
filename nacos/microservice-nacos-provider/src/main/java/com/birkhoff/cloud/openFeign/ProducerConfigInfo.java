package com.birkhoff.cloud.openFeign;

import org.springframework.beans.factory.annotation.Value;

//@Configuration
//@RefreshScope
public class ProducerConfigInfo {

    @Value("${producer.content}")
    private String producerContent;

    public String getProducerContent() {
        return producerContent;
    }

    public void setProducerContent(String producerContent) {
        this.producerContent = producerContent;
    }
}
