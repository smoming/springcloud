package per.mike.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-account-service")
public interface AccountService {

	@PostMapping(value = "/account/decrease")
	Comparable<String> decrease(@RequestParam("userId") Long userId, @RequestParam("money") Integer money);
}
