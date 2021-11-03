package ru.javafom.demo.yandexsqs.listener.service;

import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.javafom.demo.yandexsqs.listener.dto.Message;

@Slf4j
@Service
public class Listener {
    @SqsListener(value = "${message.queue.incoming}")
    public void receiveMessage(Message message) {
        log.info("Новое входящее сообщение: {}", message);
    }
}
