package per.mike.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import feign.Param;

@Mapper
public interface AccountDao {

	// 更新帳戶
	void update(@Param("userId") Long userId, @Param("money") Integer money);
}
