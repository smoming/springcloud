package per.mike.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DXC Mike
 * @date 2023/02/06
 * @description Self Load Balancer Rule
 */
@Configuration
public class MySelfRule {

  @Bean
  public IRule myRule() {
    return new RandomRule();
  }
}
