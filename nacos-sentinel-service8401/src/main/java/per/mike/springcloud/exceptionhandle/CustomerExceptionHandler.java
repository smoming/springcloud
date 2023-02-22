package per.mike.springcloud.exceptionhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import per.mike.springcloud.entities.CommonResult;

public class CustomerExceptionHandler {

	public static CommonResult<String> handleException1(BlockException exception) {
		return new CommonResult<String>(500, "調用失敗 customerExpection for Sentinel of Global -----1", "ERROR 11111");
	}

	public static CommonResult<String> handleException2(BlockException exception) {
		return new CommonResult<String>(500, "調用失敗 customerExpection for Sentinel of Global -----2", "ERROR 22222");
	}
}
