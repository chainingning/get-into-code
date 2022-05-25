package com.chaining.patterns.structural.decorator.ex1.decorator;

import com.chaining.patterns.structural.decorator.ex1.component.Drink;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛 奶 ");
        setPrice(2.0f);
    }
}
