package com.tamil.designpatterns.factory_pattern;

public class MultiCarShowroom {

    private String carName;
    public MultiCarShowroom(String carName){
        this.carName = carName;
    }

    public Car getCar(){
      CarFactory carFactory = new CarFactory();
      return carFactory.getCar(this.carName);
    }

}
