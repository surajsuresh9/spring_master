package com.constructorInjection.ambiguity;

public class Addition {
    Addition(int a, double b) {
        System.out.println("Inside constructor");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

//    Addition(int a, int b) {
//        System.out.println("Inside constructor -- int");
//    }
//
//    Addition(String a, String b) {
//        System.out.println("Inside constructor -- String");
//    }

}
