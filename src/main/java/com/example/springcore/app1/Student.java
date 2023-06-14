package com.example.springcore.app1;

public class Student {

    int studentID;
    String studentName;
    String studentaddress;

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }


    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentaddress() {
        return studentaddress;
    }


    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                '}';
    }
}
