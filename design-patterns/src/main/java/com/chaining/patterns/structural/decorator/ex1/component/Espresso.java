package com.chaining.patterns.structural.decorator.ex1.component;

import com.chaining.patterns.structural.decorator.ex1.component.Coffee;

public class Espresso extends Coffee {

    public Espresso() {
        setDes(" 意大利咖啡 ");
        setPrice(6.0f);
    }
}
