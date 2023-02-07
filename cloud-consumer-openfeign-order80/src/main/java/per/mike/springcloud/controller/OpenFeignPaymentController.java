package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;
import per.mike.springcloud.service.OpenFeignPaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Open Feign Payment Controller$
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OpenFeignPaymentController {

  @Autowired private OpenFeignPaymentService openFeignPaymentService;

  @GetMapping("/get/{id}")
  public CommonResult<Payment> getOpenFeignPayment(@PathVariable("id") Long id) {
    return openFeignPaymentService.getPaymentById(id);
  }
}
