package com.sandip.spring.di_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\sandip\\IdeaProjects" +
                "\\DemoSpringCore\\src\\main\\java\\com\\sandip\\spring\\di_object\\beans.xml");
        context.getBean("student", Student.class).cheating();
        context.getBean("anotherStudent", AnotherStudent.class).cheating();
    }
}
