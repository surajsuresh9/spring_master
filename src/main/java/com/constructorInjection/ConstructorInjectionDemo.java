package com.constructorInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionDemo {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("constructor_injection_config.xml");
        Employee e = (Employee) ac.getBean("emp");
        System.out.println(e);
    }
}
