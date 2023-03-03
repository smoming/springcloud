package per.mike.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import feign.Param;

@Mapper
public interface StorageDao {

	// 更新庫存
	void update(@Param("productId") Long productId, @Param("count") Integer count);
}
