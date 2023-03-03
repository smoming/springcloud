package per.mike.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import per.mike.springcloud.dao.OrderDao;
import per.mike.springcloud.domain.OrderDTO;
import per.mike.springcloud.service.AccountService;
import per.mike.springcloud.service.OrderService;
import per.mike.springcloud.service.StorageService;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Autowired
	private StorageService storageService;

	@Autowired
	private AccountService accountService;

	@Override
	@GlobalTransactional
	public void create(OrderDTO order) {
		log.info("----->開始新建訂單");

		orderDao.create(order);
		log.info("----->訂單為服務開始調用庫存.....");
		storageService.decrease(order.getProductId(), order.getCount());
		log.info("----->START 訂單為服務開始調用帳戶.....");
		accountService.decrease(order.getUserId(), order.getMoney());

		log.info("----->START 更新訂單狀態.....");
		orderDao.update(order.getUserId(), 0);
		log.info("----->END   更新訂單狀態.....");

		log.info("----->結束新建訂單");
	}

}
