package com.chaining.patterns.structural.decorator.ex1.decorator;

import com.chaining.patterns.structural.decorator.ex1.component.Drink;

//具体的 Decorator， 这里就是调味品
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }

}

