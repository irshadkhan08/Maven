package org.notificationDemo;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway {
    public void send(String msg){
        System.out.println("this is message of SMSGateway "+msg);
    }
}
