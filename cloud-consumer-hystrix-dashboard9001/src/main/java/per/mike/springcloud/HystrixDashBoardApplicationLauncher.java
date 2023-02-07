package per.mike.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(HystrixDashBoardApplicationLauncher.class, args);
    log.info("Hystrix DashBoard Application Launcher");

    System.out.println("##########################################");
    System.out.println("##                                      ##");
    System.out.println("##  HYSTRIX  DASHBOARD  SERVICE  START  ##");
    System.out.println("##                                      ##");
    System.out.println("##########################################");
  }
}
