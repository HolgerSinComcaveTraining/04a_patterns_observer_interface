package com.cc.java.subject;

import java.util.ArrayList;
import java.util.List;

import com.cc.java.observer.Observer;

public class Subject implements Observable {

    private String state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        // TODO Auto-generated method stub
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
    

    
}
