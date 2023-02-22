package per.mike.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;

@FeignClient(value = "cloud-nacos-sentinel-payment-service", fallback = PaymentFallbackService.class)
public interface PaymentService {

	@GetMapping(value = "/payment/paymentSQL/{id}")
	public CommonResult<Payment> getPaymentSQL(@PathVariable("id") Long id);
}
