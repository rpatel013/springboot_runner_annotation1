package com.springboot.sampleforspboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.springboot.sampleforspboot")
public class SampleforspbootApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(SampleforspbootApplication.class, args);
		MyService ms = ac.getBean(MyService.class);
		System.out.println(ms.levelmethod());



	}
}


