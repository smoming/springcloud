package per.mike.springcloud.controller;

import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;
import per.mike.springcloud.service.PaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Payment Controller
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
  @Autowired private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @PostMapping(value = "/create")
  public CommonResult<Integer> create(@RequestBody Payment payment) {
    int result = paymentService.create(payment);
    if (result > 0) {
      return new CommonResult<Integer>(200, "新增成功,serverPort: " + serverPort, result);
    } else {
      return new CommonResult<Integer>(500, "新增失敗,serverPort: " + serverPort, 0);
    }
  }

  @GetMapping(value = "/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
    Payment result = paymentService.getPaymentById(id);
    if (result != null) {
      return new CommonResult<Payment>(200, "查詢成功,serverPort: " + serverPort, result);
    } else {
      return new CommonResult<Payment>(500, "查詢無資料,serverPort: " + serverPort, null);
    }
  }

  @GetMapping(value = "/lb")
  public CommonResult<String> getLb() {
    return new CommonResult<String>(200, "調用成功 for LB", serverPort);
  }

  @GetMapping(value = "/openfeign/timeout")
  public CommonResult<String> getOpenfeignTimeout() {
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return new CommonResult<String>(200, "調用成功 for openfeign timeout", serverPort);
  }
}
