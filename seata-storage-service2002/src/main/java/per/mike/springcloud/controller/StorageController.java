package per.mike.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import per.mike.springcloud.entities.CommonResult;
import per.mike.springcloud.service.StorageService;

@RestController
@RequestMapping("/storage")
public class StorageController {

	@Autowired
	private StorageService storageService;

	@PostMapping(value = "/decrease")
	public CommonResult<String> decrease(@RequestParam("productId") Long productId,
			@RequestParam("count") Integer count) {
		storageService.decrease(productId, count);
		return new CommonResult<String>(200, "更新庫存成功", "STORAGE DECREASE SUCCESS");
	}

}
