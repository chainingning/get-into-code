package com.chaining.patterns.structural.decorator;

import java.math.BigDecimal;

/**
 * <p>
 * 饮料抽象类
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/09/16 10:33
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * cost方法是用来返回饮料的价钱（需在具体类中自己实现）
     * @return 价格
     */
    public abstract BigDecimal cost();
}
