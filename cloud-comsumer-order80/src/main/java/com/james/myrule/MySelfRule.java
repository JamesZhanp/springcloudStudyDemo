package com.james.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 23 17:49
 * 自动负载均衡的配置类
 */

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();
    }
}
