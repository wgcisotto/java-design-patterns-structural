package com.wgcisotto.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void run(){
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        assertEquals("Bread + turkey + mustard", sandwich.make());

    }

}
