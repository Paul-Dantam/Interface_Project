package com.TheIronYard;

public class Infantry extends Soldier implements Engage {
    @Override
    public String speak() {
        System.out.println("Hooah");
        return null;
    }
}
