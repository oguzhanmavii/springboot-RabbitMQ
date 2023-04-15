package springboot.rabbitmqmessageapp.consumer;


import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import springboot.rabbitmqmessageapp.dto.User;

import java.util.logging.Logger;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(User user)
    {
        LOGGER.info(String.format("Recieved Json message : %s",user.toString()));
    }
}
