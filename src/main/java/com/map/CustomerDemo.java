package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDemo {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("map_config.xml");
        Customer customer = (Customer) ac.getBean("c1");
        System.out.println(customer.getId());
        System.out.println(customer.getProducts().getClass());
        System.out.println("-- Products --");
        System.out.println(customer.getProducts());
    }
}
