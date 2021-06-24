package com.chaining.patterns.behavioral.memento;

/**
 * <p>
 * 房东(两居室)
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/24 10:25
 */
public class TwoHouseColleague extends Colleague{

    /**
     * 展示两居室
     */
    @Override
    public void handle() {
        System.out.println("两居室——合适，靠谱");
    }
}
