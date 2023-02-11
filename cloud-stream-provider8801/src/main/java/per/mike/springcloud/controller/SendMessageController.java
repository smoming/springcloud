package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.MessageProvider;

@RestController
@RequestMapping("/stream/provider")
public class SendMessageController {

	@Autowired
	private MessageProvider messageProvider;

	@GetMapping("/send")
	public CommonResult<String> sendMessage() {
		return new CommonResult<String>(200, "調用成功", messageProvider.sendMessage());
	}

}
