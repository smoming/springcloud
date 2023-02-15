package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import per.mike.springcloud.entities.CommonResult;

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
}
