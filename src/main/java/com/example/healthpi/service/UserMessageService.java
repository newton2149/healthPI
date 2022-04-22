package com.example.healthpi.service;

import com.example.healthpi.model.RequestLaunchMessage;

public interface UserMessageService {

    RequestLaunchMessage saveMessage(RequestLaunchMessage user);
      RequestLaunchMessage getMessage();

}
