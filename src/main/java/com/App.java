package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//        Employee e = (Employee) ctx.getBean("emp");
        Employee e = (Employee) ctx.getBean("e2");
        System.out.println("id: " + e.getId());
        System.out.println("name: " + e.getName());
    }
}
