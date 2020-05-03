package com.wgcisotto.structural.bridge.shapeandcolors;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String applyColor() {
        return color.applyColor();
    }

}
