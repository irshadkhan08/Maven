package org.amazon.springDemo;

public class Address {
    private String pincode;
    private String district;
//    private Double
public Address(){
    System.out.println("Hey!! I am inside the default constructor of Address Class");
}
    public Address(String pincode, String district) {
        System.out.println("Hey!! I am inside the parameterized constructor of address Class");
        this.pincode = pincode;
        this.district = district;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        System.out.println("Setting the pincode");
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        System.out.println("Setting the district");
        this.district = district;
    }
//    public Address(){
//        System.out.println("Hey!! I am inside the default constructor of Address Class");
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "pincode='" + pincode + '\'' +
//                ", district='" + district + '\'' +
//                '}';
//    }
}
