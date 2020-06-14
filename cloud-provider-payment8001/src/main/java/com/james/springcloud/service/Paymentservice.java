package com.james.springcloud.service;

import com.james.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: JamesZhan
 * @create: 2020 - 06 - 13 16:25
 */


public interface Paymentservice {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
