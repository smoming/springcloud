package per.mike.springcloud.service;

import per.mike.springcloud.domain.OrderDTO;

public interface OrderService {

	// 創建訂單
	void create(OrderDTO order);
}
