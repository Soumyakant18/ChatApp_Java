package com.example.chatappthree.controller;

import com.example.chatappthree.model.ChatMeassage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public ChatMeassage register(@Payload ChatMeassage chatMeassage, SimpMessageHeaderAccessor simpMessageHeaderAccessor){
           simpMessageHeaderAccessor.getSessionAttributes().put("username", chatMeassage.getSender());

           return chatMeassage;

    }
    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
public ChatMeassage sendMeassage(@Payload ChatMeassage chatMeassage){
        return chatMeassage;
}
}
