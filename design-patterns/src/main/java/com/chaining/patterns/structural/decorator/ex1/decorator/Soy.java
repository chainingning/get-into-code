package com.chaining.patterns.structural.decorator.ex1.decorator;

import com.chaining.patterns.structural.decorator.ex1.component.Drink;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆	");
        setPrice(1.5f);
    }

}

