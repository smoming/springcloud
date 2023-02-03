package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Eureka Application Launcher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(EurekaApplicationLauncher.class, args);
    log.info("Eureka Application Launcher");

    System.out.println("##############################");
    System.out.println("##                          ##");
    System.out.println("##  EUREKA  SERVICE  START  ##");
    System.out.println("##                          ##");
    System.out.println("##############################");
  }
}
