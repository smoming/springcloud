package per.mike.springcloud.service.Impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
  @HystrixCommand(
      fallbackMethod = "paymentInfoTimeoutHandler",
      commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
      })
  public String paymentInfoTimeout(Long id) {
    //    throw new RuntimeException("Error");
    int timeNumner = 5;
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

  public String paymentInfoTimeoutHandler(Long id) {
    return "執行緒: "
        + Thread.currentThread().getName()
        + " paymentInfoTimeoutHandler, id: "
        + id
        + " 支付系統超時或異常, 請稍後再試... ";
  }
}
