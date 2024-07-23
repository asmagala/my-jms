package com.kodilla.myjms.receiver;

import com.kodilla.myjms.domain.BookOrderDto;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class BookOrderReceiver {
    @JmsListener(containerFactory = "jmsFactory", destination = "queue-order")
    public void receive(BookOrderDto order) {
        System.out.println("--------------");
    }
}
