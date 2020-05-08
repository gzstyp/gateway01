package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWay{

    public static void main(final String[] args){
        SpringApplication.run(GateWay.class,args);
        System.out.println("gateway应用已启动");
    }
}