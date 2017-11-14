package com.epam.listener;

import java.util.ArrayList;
import java.util.List;

class TimeGenerator {

    private List<TimeGeneratorListener> listeners = new ArrayList<TimeGeneratorListener>();

    void addListener(TimeGeneratorListener toAdd) {
        listeners.add(toAdd);
    }

    void generateTime() {
        long time = System.nanoTime();
        for (TimeGeneratorListener tl : listeners) tl.generateTimeRespond();
        System.out.println(time);
    }


}
