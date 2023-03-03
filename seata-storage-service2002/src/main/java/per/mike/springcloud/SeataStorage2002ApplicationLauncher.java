package per.mike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DXC Mike
 * @date 2023/03/02
 * @description ApplicationLauncher
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeataStorage2002ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(SeataStorage2002ApplicationLauncher.class, args);
		log.info("Seata Storage Application Launcher");

		System.out.println("############################################");
		System.out.println("##                                        ##");
		System.out.println("##  SEATA  STORAGE  2002  SERVICE  START  ##");
		System.out.println("##                                        ##");
		System.out.println("############################################");
	}
}
