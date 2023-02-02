package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
public class ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(ApplicationLauncher.class, args);
    log.info("Payment Application Launcher");

    System.out.println("###############################");
    System.out.println("##                           ##");
    System.out.println("##  PAYMENT  SERVICE  START  ##");
    System.out.println("##                           ##");
    System.out.println("###############################");
  }
}
