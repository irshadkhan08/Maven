package org.spring;

public class Address {
    private String pinCode;
    private String  city;
    public Address() {
        System.out.println("i am inside the default constructor of  Address class");
    }
    public Address(String pinCode, String city) {
//        System.out.println("i am inside the parameter constructor of address class");
        this.pinCode = pinCode;
        this.city = city;
    }
    public String getPinCode() {
        return pinCode;
    }
    public void setPinCode(String pinCode) {
//        System.out.println("setting the pinCode");
        this.pinCode = pinCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
//        System.out.println("setting the city");
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode='" + pinCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
