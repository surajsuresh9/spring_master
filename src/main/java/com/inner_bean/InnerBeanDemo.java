package com.inner_bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("inner_beans_config.xml");
        Employee e1 = (Employee) abstractApplicationContext.getBean("e1");
        System.out.println(e1.getId());
        System.out.println(e1.getAddress());
    }
}
