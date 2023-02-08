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
public class Config3355ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(Config3355ApplicationLauncher.class, args);
		log.info("Config Application Launcher");

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##  CONFIG  3355  SERVICE  START  ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
	}
}
