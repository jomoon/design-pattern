package com.hjj.composite.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Component {
    protected String name;

    public abstract void add(Component c) ;
    public abstract void remove(Component c) ;
    public abstract void display(Component c) ;
}