package com.TheIronYard;

public interface Engage  {

    default String withdraw(){
        return "Run Away!";
    }


    public String shoot() ;
    public String knife();

}
