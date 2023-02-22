package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/02/22
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Order84ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(Order84ApplicationLauncher.class, args);
		log.info("Order Application Launcher");

		System.out.println("#################################");
		System.out.println("##                             ##");
		System.out.println("##  ORDER  84  SERVICE  START  ##");
		System.out.println("##                             ##");
		System.out.println("#################################");
	}
}
