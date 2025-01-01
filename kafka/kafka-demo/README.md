# kafka-demo

#### 介绍
spring boot 集成kafka发送和接收消息，适用于集成了SASL_PLAINTEXT方式动态权限管理的kafka集群环境

#### pom依赖
````
    <dependency>
	  <groupId>org.springframework.kafka</groupId>
	  <artifactId>spring-kafka</artifactId>
    </dependency>
````
#### 生产者配置
参考KafkaProducerConfig.java

#### 消息发送示例
参考KafkaSender.java

#### 消费者配置
参考KafkaConsumerConfig.java

#### 消息消费示例
参考KafkaConsumer.java

git 学习
