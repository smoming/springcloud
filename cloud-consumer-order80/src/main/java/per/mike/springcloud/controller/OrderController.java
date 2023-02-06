package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Order Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OrderController {

  // private static final String PAYMENT_URL = "http://localhost:8001";
  private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

  @Autowired private RestTemplate restTemplate;

  @GetMapping("/create")
  public CommonResult create(@RequestBody Payment payment) {
    return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
  }

  @GetMapping("/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
  }

  @GetMapping("/createForEntity")
  public CommonResult createForEntity(@RequestBody Payment payment) {
    ResponseEntity<CommonResult> res =
        restTemplate.postForEntity(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    if (res.getStatusCode().is2xxSuccessful()) {
      return res.getBody();
    } else {
      return new CommonResult<Integer>(500, "操作失敗");
    }
  }

  @GetMapping("/getForEntity/{id}")
  public CommonResult getPaymentForEntity(@PathVariable("id") Long id) {
    ResponseEntity<CommonResult> res =
        restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    if (res.getStatusCode().is2xxSuccessful()) {
      return res.getBody();
    } else {
      return new CommonResult<Payment>(500, "操作失敗");
    }
  }
}
