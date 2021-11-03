package ru.javafom.demo.yandexsqs.listener.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class Message {
    /**
     * Текст сообщения
     */
    private String text;
    /**
     * Время создания сообщения
     */
    private Instant time;
}
