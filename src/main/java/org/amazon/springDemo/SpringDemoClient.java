package org.amazon.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoClient {
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("projectBean.xml"); // bean resources
//        BeanFactory beanFactory = new XmlBeanFactory(resource);  // i created a bean factory
//        Person p = (Person) beanFactory.getBean("person1");
//        Person p1 = (Person) beanFactory.getBean("person2");
//        System.out.println(p);
//        System.out.println(p1);


        //bucket
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("projectBean.xml");
//        Person p  = (Person) context.getBean("person1");
//        System.out.println(p);
//        context.registerShutdownHook();
//        context.close();
    }
}
// bean -> bydefault -> singleton
// prototype -> it will create new object for each hit/ call / fetching of bean


// bean creation using xml
// spring as well
// annotation