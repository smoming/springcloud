package per.mike.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixPayment8001ApplicationLauncher {
  public static void main(String[] args) {
    SpringApplication.run(HystrixPayment8001ApplicationLauncher.class, args);
    log.info("Hystrix Payment Application Launcher");

    System.out.println("##############################################");
    System.out.println("##                                          ##");
    System.out.println("##  HYSTRIX  PAYMENT  8001  SERVICE  START  ##");
    System.out.println("##                                          ##");
    System.out.println("##############################################");
  }

  @Bean
  public ServletRegistrationBean getServlet() {
    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
    ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
    registrationBean.setLoadOnStartup(1);
    registrationBean.addUrlMappings("/hystrix.stream");
    registrationBean.setName("HystrixMetricsStreamServlet");
    return registrationBean;
  }
}
