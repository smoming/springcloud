package per.mike.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import feign.Param;
import per.mike.springcloud.domain.OrderDTO;

@Mapper
public interface OrderDao {

	// 創建訂單
	void create(OrderDTO order);

	// 更新訂單狀態
	void update(@Param("userId") Long userId, @Param("status") Integer status);
}
