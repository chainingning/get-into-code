package com.chaining.patterns.structural.flyweight;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/26 13:44
 */
public class IBox extends AbstractBox{

    /**
     * 抽象方法，获取形状
     *
     * @return
     */
    @Override
    public String getSharp() {
        return "I";
    }
}
