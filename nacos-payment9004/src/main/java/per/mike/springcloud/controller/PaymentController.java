package per.mike.springcloud.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.entities.Payment;

/**
 * @author DXC Mike
 * @date 2023/02/22
 * @description Payment Controller
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	private static HashMap<Long, String> hashMap = new HashMap<>();
	static {
		hashMap.put(1L, "1111111111111111111111111111111111111111");
		hashMap.put(2L, "2222222222222222222222222222222222222222");
		hashMap.put(3L, "3333333333333333333333333333333333333333");
	}

	@GetMapping(value = "/paymentSQL/{id}")
	public CommonResult<Payment> getNacos(@PathVariable("id") Long id) {
		return new CommonResult<Payment>(200, "調用成功 for Sentinel, port: " + serverPort,
				hashMap.containsKey(id) ? new Payment(id, hashMap.get(id)) : null);
	}
}
