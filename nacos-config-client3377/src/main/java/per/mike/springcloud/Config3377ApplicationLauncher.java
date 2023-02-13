package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/02/13
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
public class Config3377ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(Config3377ApplicationLauncher.class, args);
		log.info("Config Application Launcher");

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##  CONFIG  3377  SERVICE  START  ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
	}
}
