package com.example.springcore.app7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {

    @Value("Durgesh")
    String name;

    @Value("Noida Head quarter")
    String Address;
    @Value("#{cityListInfo}")
    List<String> cityList;

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", cityList=" + cityList +
                '}';
    }
}
