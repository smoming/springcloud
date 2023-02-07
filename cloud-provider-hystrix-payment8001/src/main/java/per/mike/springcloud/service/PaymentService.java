package per.mike.springcloud.service;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Payment Service$
 */
public interface PaymentService {

  String paymentInfoOk(Long id);

  String paymentInfoTimeout(Long id);

  String paymentCircuitBreaker(Long id);
}
