package com.angus.springcloud.Service;

import com.angus.springcloud.entity.Payment;

/**
 * @author angus
 * @create 2020-03-07 22:35
 */
public interface PaymentService {
	Payment create(Payment payment);

	Payment findBySerial(String serial);
}
