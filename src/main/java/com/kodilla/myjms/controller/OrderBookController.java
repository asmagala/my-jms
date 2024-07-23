package com.kodilla.myjms.controller;

import com.kodilla.myjms.domain.BookOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jms.core.JmsTemplate;

import java.util.Map;

@RestController
@RequestMapping("/books")
public class OrderBookController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping(path = "/order")
    public String processOrder(@RequestParam String buyer, @RequestParam String isbn, @RequestParam Integer quantity) {
        BookOrderDto order = new BookOrderDto(buyer, isbn, quantity);
        jmsTemplate.convertAndSend("queue-order", (Map<String, Object>) order.mapToJms());

        System.out.println(order);
        return order.toString();
    }
}
