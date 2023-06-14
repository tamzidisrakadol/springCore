package com.example.springcore.app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext  context = new ClassPathXmlApplicationContext("application-context.xml");
        Employee employee1 = (Employee) context.getBean("employeeInfo");
        System.out.println(employee1.getPhonelist());
        System.out.println(employee1.getAddressSet());
        System.out.println(employee1.getEmployeeMap());
        System.out.println(employee1.getName());
    }

}
