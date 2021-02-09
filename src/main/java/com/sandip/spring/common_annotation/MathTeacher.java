package com.sandip.spring.common_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MathTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Math Teacher");
    }
}
