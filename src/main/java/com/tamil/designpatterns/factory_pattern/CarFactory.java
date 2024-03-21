package com.tamil.designpatterns.factory_pattern;

public class CarFactory {

    public Car getCar(String carName) {
        switch (carName) {
            case "BMW":
                return new BMW();
            case "AUDI":
                return new AUDI();
            case "Tesla":
                return new Tesla();
            default:
                return null;
        }
    }

}
