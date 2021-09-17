package com.chaining.patterns.structural.decorator;

/**
 * <p>
 * 调料装饰着抽象类（继承自饮料抽象类）
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/09/16 11:02
 */
public abstract class CondimentDecorator extends Beverage{

    /**
     * 所有的调料装饰者都必须重新实现getDescription()方法
     * 这样才能够用递归的方式来得到所选饮料的整体描述
     */
    public abstract String getDescription();
}
