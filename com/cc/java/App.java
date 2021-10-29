package com.cc.java;

import com.cc.java.observer.Observer;
import com.cc.java.subject.Subject;

public class App {
    
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer o1 = new Observer("Abbonent 1", subject);
        Observer o2 = new Observer("Abbonent 2", subject);

        subject.setState("state 1");
        subject.detach(o1);
        subject.setState("state x");

    }

}
