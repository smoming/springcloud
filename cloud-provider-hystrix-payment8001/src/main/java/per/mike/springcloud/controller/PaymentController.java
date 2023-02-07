package per.mike.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.PaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Payment Controller$
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

  @Autowired private PaymentService paymentService;

  @Value(value = "server.port")
  private String serverPort;

  @GetMapping(value = "/hystrix/ok/{id}")
  public CommonResult<String> paymentInfoOk(@PathVariable("id") Long id) {
    String result = paymentService.paymentInfoOk(id);
    log.info("*****result: " + result);
    return new CommonResult<String>(200, "Ok 調用成功 for Hystrix", result);
  }

  @GetMapping(value = "/hystrix/timeout/{id}")
  public CommonResult<String> paymentInfoTimeout(@PathVariable("id") Long id) {
    String result = paymentService.paymentInfoTimeout(id);
    log.info("*****result: " + result);
    return new CommonResult<String>(200, "Timeout 調用成功 for Hystrix", result);
  }
}
