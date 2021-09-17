package com.chaining.patterns.structural.decorator;

import java.math.BigDecimal;

/**
 * <p>
 * 烘培咖啡类（一种具体的饮料）
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/09/16 10:58
 */
public class DarkRoast extends Beverage{

    /**
     * 说明他是DarkRoast饮料
     */
    public DarkRoast() {
        description = "DarkRoast";
    }

    /**
     * 实现cost方法，用来返回Decaf（低咖啡因咖啡）的价格
     *
     * @return 价格
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal("3.00");
    }
}
