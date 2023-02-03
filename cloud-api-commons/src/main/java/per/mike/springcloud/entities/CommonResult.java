package per.mike.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DXC Mike
 * @date 2023/02/03
 * @description Common Result
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

  private Integer code;
  private String message;
  private T data;

  public CommonResult(Integer code, String message) {
    this(code, message, null);
  }
}
