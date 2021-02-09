package com.sandip.spring.di;

public class Student {
    private String studentName;
    private int rollNo;

    public Student(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        System.out.println("constructor");
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Setter Roll");
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("Setter Student Name");
    }

    public void  displayStudentName() {
        System.out.println("Student Name : " + studentName + "\nRoll Number : " + rollNo);
    }
}
