package com.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryAndLangDemo {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("prop_config.xml");
        CountryAndLanguage countryAndLanguage = (CountryAndLanguage) ac.getBean("c1");
        System.out.println(countryAndLanguage.getCountryAndLangs().getClass());
        System.out.println(countryAndLanguage.getCountryAndLangs());
    }
}
