package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import per.mike.myrule.MySelfRule;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(OrderApplicationLauncher.class, args);
    log.info("Order Application Launcher");

    System.out.println("#############################");
    System.out.println("##                         ##");
    System.out.println("##  ORDER  SERVICE  START  ##");
    System.out.println("##                         ##");
    System.out.println("#############################");
  }
}
