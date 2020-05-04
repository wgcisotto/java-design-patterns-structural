package com.wgcisotto.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public abstract String toString();

    String print(MenuComponent menuComponent){
        StringBuilder sb = new StringBuilder(name);
        sb.append(": " );
        sb.append(url);
        sb.append("\n");

        return sb.toString();
    }
}
