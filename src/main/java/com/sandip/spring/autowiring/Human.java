package com.sandip.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;
//
//    public Human() {}
//
//    public Human(Heart heart) {
//        this.heart = heart;
//    }
//
//    public void setHeart(Heart heart) {
//        this.heart = heart;
//    }

    public void checkLive() {
        if(heart != null) {
            heart.alive();
            System.out.println(heart.getName());
            System.out.println(heart.getNoOfHeart());
        } else {
            System.out.println("I am not sure.");
        }

    }
}
