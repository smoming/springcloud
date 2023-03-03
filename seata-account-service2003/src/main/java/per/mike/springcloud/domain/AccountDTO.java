package per.mike.springcloud.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long userId;
	private Integer total;
	private Integer used;
	private Integer residue;
}
