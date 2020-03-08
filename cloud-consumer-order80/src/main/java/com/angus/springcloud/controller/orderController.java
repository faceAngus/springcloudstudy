package com.angus.springcloud.controller;

import com.angus.springcloud.entity.CommonResult;
import com.angus.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author angus
 * @create 2020-03-07 15:02
 */
@RestController
public class orderController {

	public static final String PAYMENT_URL = "http://localhost:8001";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/create")
	public CommonResult<Payment> creat(Payment payment){
		return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
	}

	@GetMapping("/consumer/payment/get/{serial}")
	public CommonResult<Payment> getPayment(@PathVariable("serial") String serial){
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + serial, CommonResult.class);
	}
}
