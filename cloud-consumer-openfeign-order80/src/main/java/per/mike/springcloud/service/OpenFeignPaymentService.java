package per.mike.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Payment Service
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OpenFeignPaymentService {

  @GetMapping(value = "/payment/get/{id}")
  CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping(value = "/payment/openfeign/timeout")
  CommonResult<String> getOpenfeignTimeout();
}
