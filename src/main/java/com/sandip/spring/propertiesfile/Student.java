package com.sandip.spring.propertiesfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

public class Student {
    @Value("Sandip Singh")
    private String name;
    @Value("${student.age}")
    private String age;
//
//    public String getName() {
//        return name;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//
//    public void setAge(String age) {
//        this.age = age;
//    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
