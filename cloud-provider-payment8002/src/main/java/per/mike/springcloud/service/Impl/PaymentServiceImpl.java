package per.mike.springcloud.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.mike.springcloud.dao.PaymentDao;
import per.mike.springcloud.entities.Payment;
import per.mike.springcloud.service.PaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Payment Service Impl$
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Autowired private PaymentDao paymentDao;

  @Override
  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  @Override
  public Payment getPaymentById(Long id) {
    return paymentDao.getPaymentById(id);
  }
}
