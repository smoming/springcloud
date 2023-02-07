package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Config3344ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(Config3344ApplicationLauncher.class, args);
    log.info("Config Application Launcher");

    System.out.println("####################################");
    System.out.println("##                                ##");
    System.out.println("##  CONFIG  3344  SERVICE  START  ##");
    System.out.println("##                                ##");
    System.out.println("####################################");
  }
}
