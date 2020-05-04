package com.wgcisotto.structural.composite;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void run(){

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Clain", "/personalClaims")
;
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }


}
