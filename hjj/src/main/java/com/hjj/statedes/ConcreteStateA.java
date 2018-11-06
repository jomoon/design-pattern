package com.hjj.statedes;

public class ConcreteStateA extends State{

    @Override
    public void handle(Context context) {
        context.state = new ConcreteStateA();
    }

}