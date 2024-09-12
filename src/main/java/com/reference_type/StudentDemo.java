package com.reference_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ref_config.xml");
        Student student = (Student) ctx.getBean("s1");
        System.out.println(student.getScores());
        Student student2 = (Student) ctx.getBean("s2");
        System.out.println(student2.getScores());
    }
}
