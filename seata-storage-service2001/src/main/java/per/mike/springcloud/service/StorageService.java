package per.mike.springcloud.service;

public interface StorageService {
	// 更新庫存
	void decrease(Long productId, Integer count);
}
