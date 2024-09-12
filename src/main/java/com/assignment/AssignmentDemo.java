package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignmentDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("assignment_config.xml");
        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingCart");
        System.out.println(shoppingCart);
    }
}
