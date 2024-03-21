package com.tamil.designpatterns.factory_pattern;

public class BMW implements Car{
    @Override
    public String getTopSpeed() {
        //System.out.println("BMW - Speed - 500MPH");
        return "BMW - Speed - 500MPH";
    }

    @Override
    public String getCarType() {
        //System.out.println("BMW - Type - PETROL");
        return "BMW - Type - PETROL";
    }
}
