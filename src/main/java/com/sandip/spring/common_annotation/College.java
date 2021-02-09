package com.sandip.spring.common_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
//if we not provide collegeBean then id will be by default name of class with first letter small
public class College {
    @Value("${college.collegeName}")
    private String collegeName;
    @Autowired
    private Principal principal;
    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//    }
    //    public College(Principal principal) {
//        this.principal = principal;
//    }

    public void display() {
        System.out.println("College Name : " + collegeName);
        principal.callPrincipal();
        teacher.teach();
        System.out.println("Inside College Class Display Method");
    }
}
