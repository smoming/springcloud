package per.mike.springcloud.loadbalance;

import java.util.List;
import org.springframework.cloud.client.ServiceInstance;

/**
 * @author DXC Mike
 * @date 2023/02/06
 * @description self load balance$
 */
public interface myLb {

  ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
