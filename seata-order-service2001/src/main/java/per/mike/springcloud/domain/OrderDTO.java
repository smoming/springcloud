package per.mike.springcloud.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long userId;
	private Long productId;
	private Integer count;
	private Integer money;
	private Integer status; // 訂單狀態: 0: 創建中, 1: 已完成
}
