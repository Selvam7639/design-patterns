package com.tamil.designpatterns.facade;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!ABC")
@Component
public class MarketDataProviderFacadeA implements MarketDataHelperFacade{

    @Override
    public MarketData getMarketData(String instrumentName) {

        System.out.println("Connecting with Market Data Provider A and returning required details");
        return new MarketData("Apple Inc.", 150.00, 155.00);
    }
}
