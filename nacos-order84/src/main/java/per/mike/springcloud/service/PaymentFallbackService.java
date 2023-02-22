package per.mike.springcloud.service;

import org.springframework.stereotype.Component;

import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;

@Component
public class PaymentFallbackService implements PaymentService {

	@Override
	public CommonResult<Payment> getPaymentSQL(Long id) {
		// TODO Auto-generated method stub
		return new CommonResult<Payment>(500, "服務降級, PaymentFallbackService", new Payment(id, "error"));
	}

}
