package ru.axproject.ax_lip_middleware.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PageService {


    private final String TOPIC = "ax-lip-topic";


    @KafkaListener(topics = "ax-lip-topic", groupId = "ax-lip-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }


}
