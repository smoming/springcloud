package per.mike.springcloud.loadbalance.Impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import per.mike.springcloud.loadbalance.myLb;

/**
 * @author DXC Mike
 * @date 2023/02/06
 * @description self load balace impl$
 */
@Component
public class myLbImpl implements myLb {

  private AtomicInteger atomicInteger = new AtomicInteger(0);

  public final int getAndIncrement() {
    int current;
    int next;
    do {
      current = atomicInteger.get();
      next = current >= Integer.MAX_VALUE ? 0 : current + 1;
    } while (!this.atomicInteger.compareAndSet(current, next));
    System.out.println("*****第幾次訪問, next:" + next);
    return next;
  }

  @Override
  public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
    int index = getAndIncrement() % serviceInstances.size();
    return serviceInstances.get(index);
  }
}
