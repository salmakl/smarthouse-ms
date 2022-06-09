package ma.youcode.notifier.rabbitmq.subscriber;

import ma.youcode.notifier.rabbitmq.config.RmqConfig;
import ma.youcode.notifier.rabbitmq.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = RmqConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message.getMessageContent());
    }
}
