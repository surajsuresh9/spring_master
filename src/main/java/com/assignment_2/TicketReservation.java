package com.assignment_2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    @PostConstruct
    public void initialize() {
        System.out.println("Inside init method");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Inside destroy method");
    }
}
