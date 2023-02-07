package per.mike.springcloud.filter;

import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Filter Config$
 */
@Component
@Slf4j
public class FilterConfig implements GlobalFilter, Ordered {

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    log.info("******* come in FilterConfig: " + new Date());
    String uname = exchange.getRequest().getQueryParams().getFirst("uname");
    if (uname == null) {
      log.info("****** uname is null, 不允許.....");
      exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
      return exchange.getResponse().setComplete();
    }

    return chain.filter(exchange);
  }

  @Override
  public int getOrder() {
    return 0;
  }
}
