package per.mike.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.Impl.OpenFeignHystrixPaymentFullBackService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Payment Service
 */
@Component
@FeignClient(
    value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",
    fallback = OpenFeignHystrixPaymentFullBackService.class)
public interface OpenFeignHystrixPaymentService {

  @GetMapping("/payment/hystrix/ok/{id}")
  CommonResult<String> paymentInfoOk(@PathVariable("id") Long id);

  @GetMapping("/payment/hystrix/timeout/{id}")
  CommonResult<String> paymentInfoTimeout(@PathVariable("id") Long id);
}
