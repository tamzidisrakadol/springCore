package com.example.springcore.app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ShopkeeperModel shopkeeperModel = (ShopkeeperModel) context.getBean("shopkeeperInfo");
        System.out.println(shopkeeperModel);
    }
}
