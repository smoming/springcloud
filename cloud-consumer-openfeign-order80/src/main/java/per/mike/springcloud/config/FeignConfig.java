package per.mike.springcloud.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Open Feign Config$
 */
@Configuration
public class FeignConfig {

  @Bean
  public Logger.Level feignLoggerLevel() {
    return Level.FULL;
  }
}
