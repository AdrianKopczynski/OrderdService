package com.example.s2699orderservice;

public class Adress {
    public String city;
    public String street;
    public String postCode;
    public String houseNumber;
    public String apartmentNumber;
    Adress(String city, String street,String postCode,String houseNumber,String apartmentNumber){
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }
    public String getCity(){
        return city;
    }
    public void setCity(){
        this.city = city;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(){
        this.street = street;
    }
    public String getPostCode(){
        return postCode;
    }
    public void setPostCode(){
        this.postCode = postCode;
    }
    public String getHouseNumber(){
        return houseNumber;
    }
    public void setHouseNumber(){
        this.houseNumber = houseNumber;
    }
    public String getApartmentNumber(){
        return apartmentNumber;
    }
    public void setApartmentNumber(){
        this.apartmentNumber = apartmentNumber;
    }
}
