package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
                "C:\\Users\\sandip\\IdeaProjects\\DemoSpringCore\\src\\main\\java\\org\\example\\beans.xml");
//        Sim sim = (Sim) applicationContext.getBean("sim");
        Sim sim = applicationContext.getBean("sim", Sim.class);
        sim.calling();

    }
}
