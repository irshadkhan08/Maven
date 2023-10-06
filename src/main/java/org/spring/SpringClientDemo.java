package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringClientDemo {
    public static void main(String[] args) {

//        Resource resource = new ClassPathResource("createBean.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        Person p1 = (Person) beanFactory.getBean("person1");
//        Person p2 = (Person) beanFactory.getBean("person1");
//        System.out.println(p1);
//        System.out.println(p2);
//
//
//        Address add1 = (Address) beanFactory.getBean("address1");
//        Address add2 = (Address) beanFactory.getBean("address1");
//
//        System.out.println(add1);
//        System.out.println(add2);

//        Resource resource1 = new ClassPathResource("createBean.xml");
//        BeanFactory beanFactory1 = new XmlBeanFactory(resource1);
//        Address add1 = (Address) beanFactory1.getBean("address1");
//        System.out.println(add1);
//
//        Address add2 = (Address) beanFactory1.getBean("address2");
//        System.out.println(add2);

       //second way of beans creation the object


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("createBean.xml");

//        context.getBean("address1");
//        Address address = (Address) context.getBean("address1");
//        System.out.println(address);

        Person p  = (Person) context.getBean("person1");
        System.out.println(p);

//        context.registerShutdownHook();
        context.close();



    }
}
