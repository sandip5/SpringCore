package com.sandip.spring.common_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext contexts = new AnnotationConfigApplicationContext(CollegeCof.class);
        contexts.getBean("collegeBean", College.class).display();
    }
}
