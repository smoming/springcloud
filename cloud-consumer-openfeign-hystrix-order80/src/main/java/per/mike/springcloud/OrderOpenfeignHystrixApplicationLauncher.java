package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class OrderOpenfeignHystrixApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(OrderOpenfeignHystrixApplicationLauncher.class, args);
    log.info("Order Openfeign Hystrix Application Launcher");

    System.out.println("#################################################");
    System.out.println("##                                             ##");
    System.out.println("##  ORDER  OPENFEIGN  HYSTRIX  SERVICE  START  ##");
    System.out.println("##                                             ##");
    System.out.println("#################################################");
  }
}
