package com.hjj.statedes;

public class Context {
    public State state;

    public Context(State s) {
        this.state = s;
    }

    public void request() {
        state.handle(this);
    }
}