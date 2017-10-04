package com.TheIronYard;

public class Navy extends Soldier implements Engage {

    @Override
    public String speak() {
        System.out.println("hoohyah");
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