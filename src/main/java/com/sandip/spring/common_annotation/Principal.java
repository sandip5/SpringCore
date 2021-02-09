package com.sandip.spring.common_annotation;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void callPrincipal() {
        System.out.println("Inside Principal Class callPrincipal Method");
    }
}
