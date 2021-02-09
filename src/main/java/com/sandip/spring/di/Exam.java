package com.sandip.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:" +
                "\\Users\\sandip\\IdeaProjects\\DemoSpringCore\\src\\main\\java\\com\\sandip\\spring\\di\\beans.xml");
        context.getBean("student1", Student.class).displayStudentName();
//        context.getBean("student2", Student.class).displayStudentName();
//        context.getBean("student3", Student.class).displayStudentName();
    }
}
