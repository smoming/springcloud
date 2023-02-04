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
 * @description Order Consul Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OrderConsulController {

  // private static final String PAYMENT_URL = "http://localhost:8006";
  private static final String PAYMENT_URL = "http://cloud-provider-payment-consul";

  @Autowired private RestTemplate restTemplate;

  @GetMapping("/consul")
  public CommonResult<Integer> consul() {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", CommonResult.class);
  }
}
