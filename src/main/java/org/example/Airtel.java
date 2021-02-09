package org.example;

public class Airtel implements  Sim{
    @Override
    public void calling() {
        System.out.println("Airtel Calling Method");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data Method");
    }
}
