package com.example.healthpi.service.impl;

import com.example.healthpi.model.RequestLaunchMessage;
import com.example.healthpi.repository.MessageRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserMessageServiceImpl implements com.example.healthpi.service.UserMessageService {

    private final MessageRepository messageRepository;
    private final String field = "timeStamp";

    public UserMessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public RequestLaunchMessage saveMessage(RequestLaunchMessage user) {
        return messageRepository.save(user);
    }

    @Override
    public  RequestLaunchMessage getMessage() {
        return messageRepository.findFirstByOrderByIdDesc();
    }
}

