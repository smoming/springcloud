package per.mike.springcloud.service.Impl;

import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;
import per.mike.springcloud.service.PaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Payment Service Impl$
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Override
  public String paymentInfoOk(Long id) {
    return "執行緒: " + Thread.currentThread().getName() + " paymentInfoOk, id: " + id;
  }

  @Override
  public String paymentInfoTimeout(Long id) {
    int timeNumner = 3;
    try {
      TimeUnit.SECONDS.sleep(timeNumner);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "執行緒: "
        + Thread.currentThread().getName()
        + " paymentInfoTimeout, id: "
        + id
        + " 耗時(秒): "
        + timeNumner;
  }
}
