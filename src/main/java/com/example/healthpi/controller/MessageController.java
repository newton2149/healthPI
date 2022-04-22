package com.example.healthpi.controller;

import com.example.healthpi.model.RequestLaunchMessage;
import com.example.healthpi.repository.MessageRepository;
import com.example.healthpi.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    private final UserMessageService userMessageService;

    public MessageController(UserMessageService userMessageService, MessageRepository messageRepository) {
        this.userMessageService = userMessageService;

    }
    @PostMapping("/createlaunchmessage")
    public ResponseEntity<RequestLaunchMessage> saveLaunchMessage(@RequestBody RequestLaunchMessage message){
        return new ResponseEntity<>(userMessageService.saveMessage(message), HttpStatus.CREATED);
    }
    @GetMapping("nextLaunch")
    public RequestLaunchMessage getMessageMapper(){
        return userMessageService.getMessage();
    }


}
