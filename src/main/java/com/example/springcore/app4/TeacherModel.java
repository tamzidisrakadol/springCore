package com.example.springcore.app4;

public class TeacherModel {

        //bean lifeCycle -> spring provide two important method to every bean ( init() && destroy() )
    // object create-> object value init -> call init() -> then we can use the bean -> call destroy()
    String teacherName;

    public TeacherModel() {
    }

    public String getTeacherName() {
        System.out.println("Getting name");
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        System.out.println("setting name");
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "TeacherModel{" +
                "teacherName='" + teacherName + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Inside Init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }




}
