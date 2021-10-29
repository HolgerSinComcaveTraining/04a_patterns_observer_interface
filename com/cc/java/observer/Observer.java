package com.cc.java.observer;

import com.cc.java.Logger;
import com.cc.java.subject.Subject;

public class Observer implements IObserve{

    private String name;
    private Subject s;

    public Observer(String name, Subject s) {
        this.name = name;
        this.s = s;  // Assoziation
        // TODO: registrieren
    }

    @Override
    public void update() {
        Logger.ausgabe("update");
    }

}
