package org.amazon.springDemo;


public class SpringClient {
    public static void main(String[] args) {
        System.out.println("Hey, not using anything from spring till now");
        // business logic ->here

        // object of person class
//        Person person = new Person();
//        person.setName("John");
//        person.setAddress(new Address("125001" , "Hisar"));
        // am i injecting some dependency?

        Person person1 = new Person("kapil" , new Address("125001" , "hisar"));

        // this process of injecting dependecies into the dependent class -> dependency injection
        // owner -> when to create an object -> me

        // owner -> spring -> IOC (Inversion of control)

    }
}
// server