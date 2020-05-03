package com.wgcisotto.structural.bridge.shapeandcolors;

public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract public String applyColor();

}
