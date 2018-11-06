package com.hjj.memo;

public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.state = "0";
        o.show();

        CareTaker c = new CareTaker();
        c.memoto = o.createMemo();

        o.state = "OFF";
        o.show();

        o.setMemento(c.memoto);
        o.show();

        
    }
}