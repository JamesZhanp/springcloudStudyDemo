package com.james.springcloud.service.impl;

import com.james.springcloud.dao.PaymentDao;
import com.james.springcloud.entities.Payment;
import com.james.springcloud.service.Paymentservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 13 16:25
 */
@Service
public class PaymentServiceImpl implements Paymentservice {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
