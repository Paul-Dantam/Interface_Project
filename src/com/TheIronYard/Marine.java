package com.TheIronYard;

public class Marine extends Soldier implements Engage {
    @Override
    public String speak() {
        System.out.println("oohrah");
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
