package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/02/11
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer8803ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(StreamConsumer8803ApplicationLauncher.class, args);
		log.info("Stream Consumer Application Launcher");

		System.out.println("##############################################");
		System.out.println("##                                          ##");
		System.out.println("##  STREAM  CONSUMER  8803  SERVICE  START  ##");
		System.out.println("##                                          ##");
		System.out.println("##############################################");
	}
}
