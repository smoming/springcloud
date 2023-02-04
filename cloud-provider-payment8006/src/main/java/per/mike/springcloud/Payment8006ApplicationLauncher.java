package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DXC Mike
 * @date 2023/02/04
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(Payment8006ApplicationLauncher.class, args);
    log.info("Payment Consul Application Launcher");

    System.out.println("#####################################");
    System.out.println("##                                 ##");
    System.out.println("##  PAYMENT  8006  SERVICE  START  ##");
    System.out.println("##                                 ##");
    System.out.println("#####################################");
  }
}
