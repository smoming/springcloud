package per.mike.springcloud.service.Impl;

import javax.annotation.Resource;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import cn.hutool.core.lang.UUID;
import per.mike.springcloud.service.MessageProvider;

@EnableBinding(Source.class)
public class MessageProviderImpl implements MessageProvider {

	@Resource
	private MessageChannel output;

	@Override
	public String sendMessage() {
		String serial = UUID.randomUUID().toString();
		System.out.println("******** serial: " + serial);
		output.send(MessageBuilder.withPayload(serial).build());
		return serial;
	}

}
