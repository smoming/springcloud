package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(Gateway9527ApplicationLauncher.class, args);
    log.info("Gateway Application Launcher");

    System.out.println("#####################################");
    System.out.println("##                                 ##");
    System.out.println("##  GATEWAY  9527  SERVICE  START  ##");
    System.out.println("##                                 ##");
    System.out.println("#####################################");
  }
}
