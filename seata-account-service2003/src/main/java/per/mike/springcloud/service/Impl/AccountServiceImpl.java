package per.mike.springcloud.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.mike.springcloud.dao.AccountDao;
import per.mike.springcloud.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public void decrease(Long userId, Integer money) {
		accountDao.update(userId, money);
	}

}
