package org.notificationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
//    @Autowired
    private SMSGateway smsGateway;// field injection

//
//    public void setSmsGateway(SMSGateway smsGateway) { //this is setter injection
//        this.smsGateway = smsGateway;
//    }

    public NotificationService(SMSGateway smsGateway) {//this is constructor injection
        this.smsGateway = smsGateway;
    }

    public void sendSMS(String msg){
        smsGateway.send(msg);
    }
}

