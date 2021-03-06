package com.james.springcloud.controller;

import com.james.springcloud.entities.CommonResult;
import com.james.springcloud.entities.Payment;
import com.james.springcloud.service.Paymentservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 13 16:29
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private Paymentservice paymentservice;

    /**
     * 查看是哪个提供的服务
     */
    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentservice.create(payment);
        log.info("**** 插入数据库结果：" + result);

        if (result > 0){
            return new CommonResult(200, "插入数据成功， 端口号为" + port, result);
        }
        else{
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentservice.getPaymentById(id);
        log.info("**** 数据库查询结果为 ："+payment + "sfbudbjf");

        if(payment != null){
            return new CommonResult(200, "查询成功, 使用的端口号为：" + port, payment);

        }else{
            return new CommonResult(444, "数据库中不存在对应的记录", null);
        }
    }
}
