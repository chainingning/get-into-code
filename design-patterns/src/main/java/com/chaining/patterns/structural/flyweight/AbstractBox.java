package com.chaining.patterns.structural.flyweight;

/**
 * <p>
 * 抽象
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/26 10:30
 */
public abstract class AbstractBox {

    /**
     * 抽象方法，获取形状
     * @return
     */
    public abstract String getSharp();

    public void display(String color){
        System.out.println("方块形状" + this.getSharp() + " 颜色:" + color);
    }

}
