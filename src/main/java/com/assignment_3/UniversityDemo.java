package com.assignment_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityDemo {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("assignment_3_config.xml");
        University u1 = (University) abstractApplicationContext.getBean("u1");
        University u2 = (University) abstractApplicationContext.getBean("u1");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println("u1 hashCode: " + u1.hashCode());
        System.out.println("u2 hashCode: " + u2.hashCode());
    }
}
