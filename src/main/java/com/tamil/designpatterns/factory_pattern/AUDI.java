package com.tamil.designpatterns.factory_pattern;

public class AUDI implements Car{
    @Override
    public String getTopSpeed() {
        //System.out.println("AUDI - Speed - 600MPH");
        return "AUDI - Speed - 600MPH";
    }

    @Override
    public String getCarType() {
        //System.out.println("AUDI - Type - DIESEL");
        return "AUDI - Type - DIESEL";
    }
}
