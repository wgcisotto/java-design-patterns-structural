package com.wgcisotto.structural.bridge.shapeandcolor;

import com.wgcisotto.structural.bridge.shapeandcolors.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeAndColorsTest {

    @Test
    public void shouldApplyRedColorForCircle(){
        Color red = new Red();
        Shape circle = new Circle(red);

        assertEquals("Applying red color", circle.applyColor());
    }

    @Test
    public void shouldApplyBlueColorForSquare(){
        Color blue = new Blue();
        Shape square = new Square(blue);

        assertEquals("Applying blue color", square.applyColor());
    }

}
