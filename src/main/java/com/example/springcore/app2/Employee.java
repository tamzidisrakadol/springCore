package com.example.springcore.app2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private String name;
    private List<String> phonelist;
    private Set<String> addressSet;
    private Map<String, Integer> employeeMap;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhonelist() {
        return phonelist;
    }

    public void setPhonelist(List<String> phonelist) {
        this.phonelist = phonelist;
    }

    public Set<String> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<String> addressSet) {
        this.addressSet = addressSet;
    }

    public Map<String, Integer> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Integer> employeeMap) {
        this.employeeMap = employeeMap;
    }
}
