package com.dependency_check;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionDemo {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("dependency_check_config.xml");
        Prescription prescription = (Prescription) ac.getBean("p1");
        System.out.println("id: " + prescription.getId());
        System.out.println("patientName: " + prescription.getPatientName());
        System.out.println("medicines: " + prescription.getMedicines());

    }

}
