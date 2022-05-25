package com.chaining.patterns.structural.decorator.ex1.decorator;

import com.chaining.patterns.structural.decorator.ex1.component.Drink;

public class Decorator extends Drink {

    private final Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    /**
     * 计算费用的抽象方法
     * 子类来实现
     */
    @Override
    public float cost() {
        //getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
