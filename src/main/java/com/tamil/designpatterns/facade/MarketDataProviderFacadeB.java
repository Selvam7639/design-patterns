package com.tamil.designpatterns.facade;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("ABC")
@Component
public class MarketDataProviderFacadeB implements MarketDataHelperFacade{

    @Override
    public MarketData getMarketData(String instrumentName) {

        System.out.println("Connecting with Market Data Provider B and returning required details");
        return new MarketData("Instrument - Apple Inc.", 150.70, 155.50);
    }
}