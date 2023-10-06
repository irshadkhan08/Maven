package org.notificationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NotificationClient {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.notificationDemo");
//        NotificationService service = (NotificationService)context.getBean("NotificationService");
        NotificationService service = (NotificationService)context.getBean("notificationService");
        service.sendSMS("send this otp 12354");
    }
}
