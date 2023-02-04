package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(Payment8004ApplicationLauncher.class, args);
    log.info("Payment Zk Application Launcher");

    System.out.println("#####################################");
    System.out.println("##                                 ##");
    System.out.println("##  PAYMENT  8004  SERVICE  START  ##");
    System.out.println("##                                 ##");
    System.out.println("#####################################");
  }
}
