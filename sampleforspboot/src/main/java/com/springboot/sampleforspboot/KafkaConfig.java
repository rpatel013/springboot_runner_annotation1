package com.springboot.sampleforspboot;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    public KafkaConfig(){
        System.out.println("KAFKA setup");
    }
}
