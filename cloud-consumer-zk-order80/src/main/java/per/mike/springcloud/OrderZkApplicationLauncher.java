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
public class OrderZkApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(OrderZkApplicationLauncher.class, args);
    log.info("Order Zk Application Launcher");

    System.out.println("#################################");
    System.out.println("##                             ##");
    System.out.println("##  ORDER  ZK  SERVICE  START  ##");
    System.out.println("##                             ##");
    System.out.println("#################################");
  }
}
