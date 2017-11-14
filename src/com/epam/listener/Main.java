package com.epam.listener;

public class Main {
    public static void main(String args[]){

        TimeGenerator generator = new TimeGenerator();
        TimeListenerA responderA = new TimeListenerA();
        TimeListenerB responderB = new TimeListenerB();

        generator.addListener(responderA);
        generator.addListener(responderB);
        generator.generateTime();

        TimeGeneratorListener l = responderA;
        TimeListenerA l1 = (TimeListenerA) l;
        l1.test();
        Object o = l1;
        responderA.hashCode();
        System.out.println(responderA);
    }

}
