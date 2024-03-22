package com.tamil.designpatterns.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MarketDataService marketDataService;

    @GetMapping("/market-data/{instrumentName}")
    public MarketData getMarketData(@PathVariable String instrumentName){
        return marketDataService.getMarketData(instrumentName);
    }

}
