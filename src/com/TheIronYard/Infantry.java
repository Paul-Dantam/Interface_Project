package com.TheIronYard;

public class Infantry extends Soldier implements Engage {
    @Override
    public String speak() {
        System.out.println("Hooah");
        return null;
    }

    @Override
    public String shoot() {
        System.out.println("tactical withdrawal");
        return null;
    }

    @Override
    public String knife() {
        System.out.println("Schwerpunkt");
        return null;
    }
}
