package com.epam.listener;

public class TimeListenerA implements TimeGeneratorListener {

    private String name = "test name";

    @Override
    public void generateTimeRespond() {
        System.out.println("get you from A");
    }
    public void test() {
        System.out.println("get you from A");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Name " + name;
    }
}
