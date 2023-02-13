package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import per.mike.springcloud.entities.CommonResult;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigClientController {

	@Value("${config.info}")
	private String configInfo;

	@GetMapping("/getConfigInfo")
	public CommonResult<String> getConfigInfo() {
		return new CommonResult<String>(200, "調用成功 for nacos", configInfo);
	}
}
