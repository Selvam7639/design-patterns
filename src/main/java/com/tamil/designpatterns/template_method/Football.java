package com.tamil.designpatterns.template_method;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Play Started");
    }

    @Override
    void endPlay() {
        System.out.println("Football Play Ended");
    }
}
