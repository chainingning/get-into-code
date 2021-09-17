package com.chaining.patterns.structural.decorator;

import java.math.BigDecimal;

/**
 * <p>
 * 浓缩咖啡类（一种具体饮料）
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/09/16 11:00
 */
public class Espresso extends Beverage{

    /**
     * 说明他是Espresso饮料
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * 实现cost方法，用来返回Espresso（浓缩咖啡）的价格
     *
     * @return 价格
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("2.00");
    }
}
