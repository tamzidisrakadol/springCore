package com.example.springcore.app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        TeacherModel teacherModel = (TeacherModel) context.getBean("teacherInfo");
        System.out.println(teacherModel);

        // use AbstractApplicationContext for calling destroy()
        context.registerShutdownHook();

        System.out.println("_________________________________________");
        Somosa somosa = (Somosa) context.getBean("somosaInfo");
        System.out.println(somosa);

    }
}
