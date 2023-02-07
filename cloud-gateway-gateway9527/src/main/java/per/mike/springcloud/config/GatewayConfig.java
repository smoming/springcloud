package per.mike.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Gateway Config
 */
@Configuration
public class GatewayConfig {

  @Bean
  public RouteLocator customRouteLocator1(RouteLocatorBuilder builder) {
    return builder
        .routes()
        .route("path_route_1", r -> r.path("/ent").uri("https://news.baidu.com/ent"))
        .build();
  }

  @Bean
  public RouteLocator customRouteLocator2(RouteLocatorBuilder builder) {
    return builder
        .routes()
        .route("path_route_2", r -> r.path("/mil").uri("https://news.baidu.com/mil"))
        .build();
  }
}
