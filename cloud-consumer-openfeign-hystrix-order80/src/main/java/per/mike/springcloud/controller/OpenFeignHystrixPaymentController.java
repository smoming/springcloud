package per.mike.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.OpenFeignHystrixPaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description Open Feign Hystrix Payment Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
@DefaultProperties(defaultFallback = "paymentInfoTimeoutHandlerForGlobal")
public class OpenFeignHystrixPaymentController {

  @Autowired private OpenFeignHystrixPaymentService openFeignHystrixPaymentService;

  @GetMapping("/hystrix/ok/{id}")
  public CommonResult<String> paymentInfoOk(@PathVariable("id") Long id) {
    return openFeignHystrixPaymentService.paymentInfoOk(id);
  }

  @GetMapping("/hystrix/timeout/{id}")
  //  @HystrixCommand(
  //      fallbackMethod = "paymentInfoTimeoutHandler",
  //      commandProperties = {
  //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value =
  // "1500")
  //      })
  @HystrixCommand
  public CommonResult<String> paymentInfoTimeout(@PathVariable("id") Long id) {
    return openFeignHystrixPaymentService.paymentInfoTimeout(id);
  }

  public CommonResult<String> paymentInfoTimeoutHandler(@PathVariable("id") Long id) {
    return new CommonResult<String>(
        500,
        "下單系統80, 執行緒: "
            + Thread.currentThread().getName()
            + " paymentInfoTimeoutHandler, id: "
            + id
            + " 支付系統超時或異常, 請稍後再試... ",
        null);
  }

  public CommonResult<String> paymentInfoTimeoutHandlerForGlobal() {
    return new CommonResult<String>(
        500,
        "Global 下單系統80, 執行緒: "
            + Thread.currentThread().getName()
            + " paymentInfoTimeoutHandlerForGlobal,"
            + " 支付系統超時或異常, 請稍後再試... ",
        null);
  }
}
