package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import lombok.extern.slf4j.Slf4j;
import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.exceptionhandle.CustomerExceptionHandler;

/**
 * @author DXC Mike
 * @date 2023/02/13
 * @description Sentinel Controller
 */
@Slf4j
@RestController
@RequestMapping(value = "/sentinel")
public class SentinelController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/testA/{id}")
	public CommonResult<String> testA(@PathVariable("id") Integer id) {
		return new CommonResult<String>(200, "調用成功 test A for Sentinel, id: " + id, serverPort);
	}

	@GetMapping(value = "/testB/{id}")
	public CommonResult<String> testB(@PathVariable("id") Integer id) {
		return new CommonResult<String>(200, "調用成功 test B for Sentinel, id: " + id, serverPort);
	}

	@GetMapping(value = "/byResource")
	@SentinelResource(value = "byResource", blockHandler = "handleException")
	public CommonResult<String> byResource() {
		return new CommonResult<String>(200, "調用成功 byResource for Sentinel", serverPort);
	}

	public CommonResult<String> handleException(BlockException exception) {
		return new CommonResult<String>(500, "調用失敗 byResource for Sentinel", serverPort);
	}

	@GetMapping(value = "/customerExpection")
	@SentinelResource(value = "customerExpection", blockHandlerClass = CustomerExceptionHandler.class, blockHandler = "handleException1")
	public CommonResult<String> customerExpection() {
		return new CommonResult<String>(200, "調用成功 customerExpection for Sentinel", serverPort);
	}
}
