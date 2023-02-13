package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/02/13
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9001ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(Payment9001ApplicationLauncher.class, args);
		log.info("Payment Application Launcher");

		System.out.println("#####################################");
		System.out.println("##                                 ##");
		System.out.println("##  PAYMENT  9001  SERVICE  START  ##");
		System.out.println("##                                 ##");
		System.out.println("#####################################");
	}
}
