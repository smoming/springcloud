package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import per.mike.springcloud.entities.CommonResult;

/**
 * @author DXC Mike
 * @date 2023/02/04
 * @description Order Zk Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OrderZkController {

  // private static final String PAYMENT_URL = "http://localhost:8004";
  private static final String PAYMENT_URL = "http://cloud-provider-payment-zk";

  @Autowired private RestTemplate restTemplate;

  @GetMapping("/zk")
  public CommonResult<Integer> create() {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", CommonResult.class);
  }
}
