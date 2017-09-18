package com.TheIronYard;

public class Marine extends Soldier {
    @Override
    public String speak() {
        System.out.println("oohrah");
        return null;
    }

    @Override
    public String defend() {
        System.out.println("tactical withdrawal");
        return null;
    }

    @Override
    public String attack() {
        System.out.println("Schwerpunkt");
        return null;
    }
}
