package com.example.springcore.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Apple apple = (Apple) context.getBean("aClass");
        System.out.println(apple.getxA());
        System.out.println(apple.getBanana());

        FruiteSeller seller = (FruiteSeller) context.getBean("sellerInfo");
        System.out.println(seller.sellerName);
        System.out.println(seller.sellerVoterID);
    }
}
