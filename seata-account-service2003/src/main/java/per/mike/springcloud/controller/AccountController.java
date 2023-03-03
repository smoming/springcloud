package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping(value = "/decrease")
	public CommonResult<String> decrease(@RequestParam("userId") Long userId, @RequestParam("money") Integer money) {
		accountService.decrease(userId, money);
		return new CommonResult<String>(200, "更新帳戶成功", "ACCOUNT DECREASE SUCCESS");
	}

}
