package per.mike.springcloud.service.Impl;

import org.springframework.stereotype.Component;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.OpenFeignHystrixPaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/07
 * @description OpenFeignHystrixPaymentFullBackService$
 */
@Component
public class OpenFeignHystrixPaymentFullBackService implements OpenFeignHystrixPaymentService {

  @Override
  public CommonResult<String> paymentInfoOk(Long id) {
    return new CommonResult<String>(
        500,
        "下單系統80, 執行緒: "
            + Thread.currentThread().getName()
            + " OpenFeignHystrixPaymentFullBackService - paymentInfoOk , id: "
            + id
            + " 支付系統超時或異常, 請稍後再試... ",
        null);
  }

  @Override
  public CommonResult<String> paymentInfoTimeout(Long id) {
    return new CommonResult<String>(
        500,
        "下單系統80, 執行緒: "
            + Thread.currentThread().getName()
            + " OpenFeignHystrixPaymentFullBackService - paymentInfoTimeout , id: "
            + id
            + " 支付系統超時或異常, 請稍後再試... ",
        null);
  }
}
