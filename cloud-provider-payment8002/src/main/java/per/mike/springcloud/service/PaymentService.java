package per.mike.springcloud.service;

import per.mike.springcloud.entities.Payment;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Payment Service$
 */
public interface PaymentService {

  int create(Payment payment);

  Payment getPaymentById(Long id);
}
