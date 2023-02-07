package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderOpenfeignApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(OrderOpenfeignApplicationLauncher.class, args);
    log.info("Order Openfeign Application Launcher");

    System.out.println("#######################################");
    System.out.println("##                                   ##");
    System.out.println("##  ORDER OPENFEIGN  SERVICE  START  ##");
    System.out.println("##                                   ##");
    System.out.println("#######################################");
  }
}
