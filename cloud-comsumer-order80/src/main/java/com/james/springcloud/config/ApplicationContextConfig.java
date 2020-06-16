package com.james.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 14 23:17
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    /**
     * 默认的负载均衡模式为轮询
     */
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
