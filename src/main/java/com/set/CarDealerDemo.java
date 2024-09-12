package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerDemo {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("set_config.xml");
        CarDealer carDealer = (CarDealer) ac.getBean("c1");
        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModels().getClass());
        System.out.println("-- Models --");
        for (String model : carDealer.getModels()) {
            System.out.println(model);
        }
    }
}
