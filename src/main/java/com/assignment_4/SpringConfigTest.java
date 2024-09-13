package com.assignment_4;

import com.propertyPlaceHolder.MyDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringConfigTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("assignment_4_config.xml");
        SpringConfig springConfig = (SpringConfig) ac.getBean("config");
        System.out.println(springConfig);
    }
}
