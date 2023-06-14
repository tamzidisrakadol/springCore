package com.example.springcore.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Student student1 = (Student) context.getBean("studentInfo");
        System.out.println(student1);

        Student student2 =(Student) context.getBean("studentInfoSecond");
        System.out.println(student2);
    }
}
