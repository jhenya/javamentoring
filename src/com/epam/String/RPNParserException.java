package com.epam.String;

public class RPNParserException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Wronr string");
        super.printStackTrace();
    }
}
