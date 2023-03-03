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
public class SeataAccount2003ApplicationLauncher {
	public static void main(String[] args) {
		SpringApplication.run(SeataAccount2003ApplicationLauncher.class, args);
		log.info("Seata Account Application Launcher");

		System.out.println("############################################");
		System.out.println("##                                        ##");
		System.out.println("##  SEATA  ACCOUNT  2003  SERVICE  START  ##");
		System.out.println("##                                        ##");
		System.out.println("############################################");
	}
}
