package com.sandip.spring.autowiring;

public class Heart {
    private String name;
    private int noOfHeart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public void alive() {
        System.out.println("I am live.");
    }
}
