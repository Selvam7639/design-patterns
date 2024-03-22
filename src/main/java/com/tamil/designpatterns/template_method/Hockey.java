package com.tamil.designpatterns.template_method;

public class Hockey extends Game {
    @Override
    void initialize() {
        System.out.println("Hockey Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Hockey Play Started");
    }

    @Override
    void endPlay() {
        System.out.println("Hockey Play Ended");
    }
}
