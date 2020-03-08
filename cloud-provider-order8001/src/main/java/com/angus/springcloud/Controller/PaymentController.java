package com.angus.springcloud.Controller;

import com.angus.springcloud.Service.PaymentService;
import com.angus.springcloud.entity.CommonResult;

import com.angus.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author angus
 * @create 2020-03-07 22:40
 */
@RestController
@Slf4j
public class PaymentController {
	@Resource
	private PaymentService paymentService;

	@PostMapping(value = "payment/create")
	public CommonResult create(@RequestBody Payment payment){
		Payment result =paymentService.create(payment);
		if(result !=  null){
			return new CommonResult(200,"插入成功", result);
		}else {
			return new CommonResult(444,"插入数据失败", null);
		}
	}

	@GetMapping(value = "payment/get/{serial}")
	public CommonResult getPaymentBySerial(@PathVariable("serial") String serial){
		Payment result = paymentService.findBySerial(serial);
		if(result != null){
			return new CommonResult(200, "查询成功", result);
		}else {
			return new CommonResult(444, "查询失败",null);
		}
	}
}
