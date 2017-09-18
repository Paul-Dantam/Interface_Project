package com.TheIronYard;

public class Infantry extends Soldier {
    @Override
    public String speak() {
        System.out.println("Hooah");
        return null;
    }

    @Override
    public String defend() {
        System.out.println("defense in depth");
        return null;
    }

    @Override
    public String attack() {
        System.out.println("superior firepower and encirclement");
        return null;
    }
}
