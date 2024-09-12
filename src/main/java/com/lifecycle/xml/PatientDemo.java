package com.lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientDemo {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lc.xml");
        Patient patient = (Patient) ctx.getBean("p1");
        System.out.println(patient);
        ctx.registerShutdownHook();
    }
}
