package per.mike.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import per.mike.springcloud.entities.Payment;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Payment Dao
 */
@Mapper
public interface PaymentDao {

  int create(Payment payment);

  Payment getPaymentById(@Param("id") Long id);
}
