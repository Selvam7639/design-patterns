package com.tamil.designpatterns.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MarketData {

    private String instrumentName;
    private Double openingPrice;
    private Double closingPrice;

}
