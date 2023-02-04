package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author DXC Mike
 * @date 2023/02/04
 * @description Eureka 7002 Application Launcher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(Eureka7002ApplicationLauncher.class, args);
    log.info("Eureka Application Launcher");

    System.out.println("####################################");
    System.out.println("##                                ##");
    System.out.println("##  EUREKA  7002  SERVICE  START  ##");
    System.out.println("##                                ##");
    System.out.println("####################################");
  }
}
