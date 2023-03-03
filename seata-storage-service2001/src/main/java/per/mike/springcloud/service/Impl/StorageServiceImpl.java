package per.mike.springcloud.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.mike.springcloud.dao.StorageDao;
import per.mike.springcloud.service.StorageService;

@Service
public class StorageServiceImpl implements StorageService {

	@Autowired
	private StorageDao storageDao;

	@Override
	public void decrease(Long productId, Integer count) {
		storageDao.update(productId, count);
	}

}
