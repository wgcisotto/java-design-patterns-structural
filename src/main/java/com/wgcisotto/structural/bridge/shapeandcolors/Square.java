package com.wgcisotto.structural.bridge.shapeandcolors;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public String applyColor() {
        return color.applyColor();
    }
}
