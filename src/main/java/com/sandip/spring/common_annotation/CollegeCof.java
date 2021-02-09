package com.sandip.spring.common_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.sandip.spring.common_annotation")
@PropertySource("classpath:college-info.properties")
public class CollegeCof {
    /*
    @Bean
    public Principal principalBean() {
        return new Principal();
    }
    @Bean
    public Teacher mathTeacherBean() {
        return new MathTeacher();
    }
    //@Bean(name = {"colBean", "another"}) we can give single or multiple name
    @Bean
    public College collegeBean() {
        College college = new College();
        college.setTeacher(mathTeacherBean());
        college.setPrincipal(principalBean());
        return college;
    }

     */
}
