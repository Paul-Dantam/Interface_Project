package com.TheIronYard;

abstract public class Soldier implements Engage, Bomb {
    String name;
    String rank;
    int serialNumber;
    public void sleep(){

        System.out.println("snore");
    }
    public void eat(){
        System.out.println("chew");
    }
    public void walk(){
        System.out.println("trudge");
    }
    abstract public String speak();
    @Override
    public String shoot() {
        System.out.println("Dakka dakka");
        return null;
    }
    @Override
    public String knife() {
        System.out.println("Slice");
        return null;
    }
    @Override
    public String Bomb(){
        System.out.println("Boom");
        return "Boom";
    }
    @Override
    public String withdraw(){
        return "Run Away Again!";
    }
}
