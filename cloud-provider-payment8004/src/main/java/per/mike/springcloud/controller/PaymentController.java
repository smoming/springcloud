package per.mike.springcloud.controller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.mike.springcloud.entities.CommonResult;

/**
 * @author DXC Mike
 * @date 2023/02/04
 * @description Payment Controller
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/zk")
  public CommonResult<String> zk() {
    return new CommonResult<String>(
        200,
        "調用成功",
        "spring cloud with zookeeper: " + serverPort + ",UUID: " + UUID.randomUUID().toString());
  }
}
