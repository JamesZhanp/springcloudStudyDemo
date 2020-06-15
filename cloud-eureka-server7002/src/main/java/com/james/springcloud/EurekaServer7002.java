package com.james.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 15 19:44
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002.class, args);
    }
}
