package ma.youcode.device.rabbitmq.publisher;

import lombok.RequiredArgsConstructor;
import ma.youcode.device.rabbitmq.config.RmqConfig;
import ma.youcode.device.rabbitmq.model.CustomMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class MessagePublisher {

    private final RabbitTemplate template;

    public String publishMessage(CustomMessage customMessage) {
        customMessage.setMessageId(UUID.randomUUID().toString());
        customMessage.setMessageDateTime(new Date());
        template.convertAndSend(
                RmqConfig.EXCHANGE,
                RmqConfig.ROUTING_KEY,
                customMessage
        );

        return "Message {"+customMessage.getMessageContent()+"} Published At: "+customMessage.getMessageDateTime();
    }
}
