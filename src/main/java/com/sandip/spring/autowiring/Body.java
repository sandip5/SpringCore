package com.sandip.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\sandip\\IdeaProjects\\DemoSpringCore\\src\\main\\java\\com\\sandip\\spring\\autowiring\\bean.xml");
        context.getBean("human", Human.class).checkLive();
    }
}
