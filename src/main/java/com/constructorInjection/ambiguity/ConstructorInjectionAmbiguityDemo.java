package com.constructorInjection.ambiguity;

import com.constructorInjection.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionAmbiguityDemo {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("constructor_injection_ambiguity_config.xml");
        Addition add = (Addition) ac.getBean("add");

        // by default, all arguments are considered as String (container will check for String)
        // based on the type, container then converts it to the appropriate type

        //        Container         match
        //           |             ----------> sum(String x, String y)
        //           |
        //       sum(double x, double y)
        //       sum(int x, int y)
        //

        // use :
        // <bean name="add" class="com.constructorInjection.ambiguity.Addition">
        //        <constructor-arg value="10" type="int"/>
        //        <constructor-arg value="20" type="int"/>
        // </bean>

        // Index Ambiguity
        //        <constructor-arg value="10.0" type="double" index="1"/>
        //        <constructor-arg value="20" type="int" index="0"/>
    }
}
