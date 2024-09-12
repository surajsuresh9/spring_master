package com.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("list_config.xml");
        Hospital h1 = (Hospital) ctx.getBean("h1");
        System.out.println("name: " + h1.getName());
        System.out.println(h1.getDepartments().getClass());
        System.out.println("-- Departments --");
        for (String dept : h1.getDepartments()) {
            System.out.println(dept);
        }
    }
}
