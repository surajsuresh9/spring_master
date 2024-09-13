package com.inner_bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("inner_beans_config.xml");
        Employee e1 = (Employee) abstractApplicationContext.getBean("e1");
        Employee e2 = (Employee) abstractApplicationContext.getBean("e1");
        System.out.println(e1.getId());
        System.out.println(e1.getAddress());
        System.out.println("e1 hashCode: " + e1.hashCode()); // default scope is singleton
        System.out.println("e2 hashCode: " + e2.hashCode());

//        e1 hashCode: 11249189
//        e2 hashCode: 159290353
    }
}
