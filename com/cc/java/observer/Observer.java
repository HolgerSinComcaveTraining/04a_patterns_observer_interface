package com.cc.java.observer;

import com.cc.java.Logger;
import com.cc.java.subject.Subject;

public class Observer implements iObserve {

    private String name;
    private Subject s;

    



    public Observer(String name, Subject s) {
        this.name = name;
        this.s = s;
        s.attach(this);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        String str = name + ": observes, that the subject has changed its state to: " + s.getState();
        Logger.ausgabe(str);
    }

    
}
