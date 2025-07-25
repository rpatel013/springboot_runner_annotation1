package com.springboot.sampleforspboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyService {
    @Autowired
    Report rpp;

    public String levelmethod(){
        System.out.println("completed");
        return rpp.whichrep();

    }
public MyService(){
        System.out.println("rajan");
    }
    @PostConstruct
    public void inmethod(){
        System.out.println("IN");
    }
    @PreDestroy
    public void outMethod(){
        System.out.println("exit method");
    }



}
