package org.amazon.springDemo;

public class Person {
    private String name;
    private Address address;
    public Person(){
        System.out.println("Hey!! I am inside the default constructor of Person Class");
    }
    public Person(String name, Address address) {
        System.out.println("Hey!! I am inside the parametrized constructor of Person Class");
        this.name = name;
        this.address = address;
    }
//    public Person(){
//        System.out.println("Hey!! I am inside the default constructor of Person Class");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting the name");
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting the address");
        this.address = address;
    }

//    private void beanInitialization(){
//        System.out.println("hey !! Inside the beanInitialization method ");
//    }
//
//    private void  beanDestruction(){
//        System.out.println("hey !! Inside the beanDestruction method ");
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", address=" + address +
//                '}';
//    }
}