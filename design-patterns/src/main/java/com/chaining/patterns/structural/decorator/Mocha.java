package com.chaining.patterns.structural.decorator;

import java.math.BigDecimal;

/**
 * <p>
 * 摩卡调料类（继承自CondimentDecorator）
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/09/17 9:27
 */
public class Mocha extends CondimentDecorator{

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    /**
     * cost方法是用来返回饮料的价钱（需在具体类中自己实现）
     *
     * @return 价格
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.2").add(beverage.cost());
    }

    /**
     * 在原来饮料的基础上添加上Mocha描述（原来的饮料加入Mocha调料，被Mocha调料装饰）
     *
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }
}
