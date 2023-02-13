package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import per.mike.springcloud.entities.CommonResult;

/**
 * @author DXC Mike
 * @date 2023/02/13
 * @description Order Controller
 */
@RestController
@RequestMapping("/order/consumer/payment")
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${service-url.nacos-user-service}")
	private String serverUrl;

	@GetMapping("/nacos/{id}")
	public CommonResult getPaymentLb(@PathVariable("id") Integer id) {
		return restTemplate.getForObject(serverUrl + "/payment/nacos/" + id, CommonResult.class);
	}

}
