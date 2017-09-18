package com.TheIronYard;

abstract public class Soldier implements doctrine,  {
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


}
