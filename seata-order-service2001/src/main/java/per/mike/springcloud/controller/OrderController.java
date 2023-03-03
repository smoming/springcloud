package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import per.mike.springcloud.domain.OrderDTO;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = "/create")
	public CommonResult<String> create(@RequestBody OrderDTO order) {
		orderService.create(order);
		return new CommonResult<String>(200, "創建訂單成功", "ORDER CREATE SUCCESS");
	}

}
