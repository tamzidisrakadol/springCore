package com.example.springcore.app8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

    }
}
