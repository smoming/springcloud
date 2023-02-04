package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class Payment8001ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(Payment8001ApplicationLauncher.class, args);
    log.info("Payment Application Launcher");

    System.out.println("#####################################");
    System.out.println("##                                 ##");
    System.out.println("##  PAYMENT  8001  SERVICE  START  ##");
    System.out.println("##                                 ##");
    System.out.println("#####################################");
  }
}
