package com.propertyPlaceHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("property_placeHolder_config.xml");
        MyDAO myDAO = (MyDAO) ac.getBean("myDAO");
        System.out.println(myDAO);
    }
}
