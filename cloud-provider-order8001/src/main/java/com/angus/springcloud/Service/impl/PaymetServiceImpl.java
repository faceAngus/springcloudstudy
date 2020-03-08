package com.angus.springcloud.Service.impl;

import com.angus.springcloud.Repository.PaymentRepository;
import com.angus.springcloud.Service.PaymentService;
import com.angus.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.PipedReader;

/**
 * @author angus
 * @create 2020-03-07 22:36
 */
@Service
public class PaymetServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment create(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public Payment findBySerial(String serial) {
		return paymentRepository.findBySerial(serial);
	}
}
