package com.sandip.spring.propertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\sandip\\IdeaProjects\\DemoSpringCore\\src\\main\\java\\com\\sandip\\spring\\propertiesfile\\beans.xml");
        context.getBean("student", Student.class).display();
    }
}
