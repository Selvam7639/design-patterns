package com.tamil.designpatterns.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketDataService {

    @Autowired
    MarketDataHelperFacade marketDataHelperFacade;

    public MarketData getMarketData(String instrumentName) {
        return marketDataHelperFacade.getMarketData(instrumentName);
    }

}
