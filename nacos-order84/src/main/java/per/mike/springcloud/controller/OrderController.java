package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;
import per.mike.springcloud.service.PaymentService;

/**
 * @author DXC Mike
 * @date 2023/02/22
 * @description Order Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${service-url.nacos-user-service}")
	private String serverUrl;

	@GetMapping("/paymentSQL/{id}")
//	@SentinelResource(value = "fallback", fallback = "handlerFallback")
//	@SentinelResource(value = "fallback", blockHandler = "blockHandler")
	@SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler")
//	@SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler", exceptionsToIgnore = {
//			IllegalArgumentException.class })
	public CommonResult<Payment> getpaymentSQL(@PathVariable("id") Integer id) {
		@SuppressWarnings("unchecked")
		CommonResult<Payment> result = restTemplate.getForObject(serverUrl + "/payment/paymentSQL/" + id,
				CommonResult.class);

		if (id == 4) {
			throw new IllegalArgumentException("IlleqalArgumentException, 非法參數.....");
		} else if (result.getData() == null) {
			throw new NullPointerException("NullPointerException, 該ID查無資料");
		}

		return result;
	}

	public CommonResult<Payment> handlerFallback(@PathVariable("id") Integer id, Throwable exception) {
		return new CommonResult<Payment>(500, "handlerFallback, exception: " + exception.getMessage(), null);
	}

	public CommonResult<Payment> blockHandler(@PathVariable("id") Integer id, BlockException exception) {
		return new CommonResult<Payment>(500, "blockHandler, exception: " + exception.getMessage(), null);
	}

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/paymentSQL/openFeign/{id}")
	public CommonResult<Payment> getPaymentSQL(@PathVariable("id") Long id) {
		return paymentService.getPaymentSQL(id);
	}

}
