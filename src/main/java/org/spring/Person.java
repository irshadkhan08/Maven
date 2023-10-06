package org.spring;

public class Person {
    private String name;
    private Address address;


    public Person() {
        System.out.println("i am inside the default constructor of Person class ");
    }
    public Person(String name, Address address) {
//        System.out.println("i am inside the parameter constructor of person class");
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
//        System.out.println("setting the name");
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
//        System.out.println("setting the address");
        this.address = address;
    }

    public void personAge(){
        System.out.println("this person is 20");
    }

    public void destroyMethod(){
        System.out.println("this method is destroy method");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
