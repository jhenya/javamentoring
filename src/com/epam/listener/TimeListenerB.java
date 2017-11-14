package com.epam.listener;

public class TimeListenerB implements TimeGeneratorListener{

    @Override
    public void generateTimeRespond() {
        System.out.println("get you from B");
    }
}
