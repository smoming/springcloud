package per.mike.springcloud.service;

public interface AccountService {
	// 更新帳戶
	void decrease(Long userId, Integer money);
}
