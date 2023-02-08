package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class Config3366ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(Config3366ApplicationLauncher.class, args);
		log.info("Config 3366 Application Launcher");

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##  CONFIG  3366  SERVICE  START  ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
	}
}
