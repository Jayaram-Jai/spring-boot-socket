package com.kran.demo.controller;

import java.util.Date;

import com.kran.demo.dto.Greeting;
import com.kran.demo.dto.Message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    @MessageMapping("/hello")
    @SendTo("/response/greeting")
    public Greeting greeting(Message message) throws InterruptedException {
        Thread.sleep(2000);
        return new Greeting(message.getName() + " added at " + new Date());
    }

}