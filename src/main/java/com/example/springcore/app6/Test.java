package com.example.springcore.app6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Person person = (Person) context.getBean("lisInfo");


        System.out.println(person);

    }


}
