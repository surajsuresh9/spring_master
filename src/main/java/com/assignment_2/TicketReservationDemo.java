package com.assignment_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TicketReservationDemo {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("assignment_2_config.xml");
        TicketReservation ticketReservation = (TicketReservation) abstractApplicationContext.getBean("tr");
        abstractApplicationContext.registerShutdownHook();
    }
}
