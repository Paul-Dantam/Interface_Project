package com.TheIronYard;

public class Marine extends Soldier implements Engage {
    @Override
    public String speak() {
        System.out.println("oohrah");
        return null;
    }
}
