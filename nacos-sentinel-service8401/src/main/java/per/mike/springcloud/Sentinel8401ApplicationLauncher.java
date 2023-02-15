package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/02/15
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Sentinel8401ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(Sentinel8401ApplicationLauncher.class, args);
		log.info("Sentinel Application Launcher");

		System.out.println("######################################");
		System.out.println("##                                  ##");
		System.out.println("##  SENTINEL  8401  SERVICE  START  ##");
		System.out.println("##                                  ##");
		System.out.println("######################################");
	}
}
