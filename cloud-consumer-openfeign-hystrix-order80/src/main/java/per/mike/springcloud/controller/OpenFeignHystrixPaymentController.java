package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.OpenFeignHystrixPaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Open Feign Hystrix Payment Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OpenFeignHystrixPaymentController {

  @Autowired private OpenFeignHystrixPaymentService openFeignHystrixPaymentService;

  @GetMapping("/hystrix/ok/{id}")
  public CommonResult<String> paymentInfoOk(@PathVariable("id") Long id) {
    return openFeignHystrixPaymentService.paymentInfoOk(id);
  }

  @GetMapping("/hystrix/timeout/{id}")
  public CommonResult<String> paymentInfoTimeout(@PathVariable("id") Long id) {
    return openFeignHystrixPaymentService.paymentInfoTimeout(id);
  }
}
