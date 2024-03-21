package com.tamil.designpatterns.factory_pattern;

public class Tesla implements Car{
    @Override
    public String getTopSpeed() {
        //System.out.println("Tesla - Speed - 1000MPH");
        return "Tesla - Speed - 1000MPH";
    }

    @Override
    public String getCarType() {
        //System.out.println("Tesla - Type - ELECTRIC");
        return "Tesla - Type - ELECTRIC";
    }
}
