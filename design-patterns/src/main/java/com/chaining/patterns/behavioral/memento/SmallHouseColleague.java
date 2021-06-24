package com.chaining.patterns.behavioral.memento;

/**
 * <p>
 * 房东(小房间)
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/24 10:24
 */
public class SmallHouseColleague extends Colleague{

    /**
     * 展示单间
     */
    @Override
    public void handle() {
        System.out.println("单间——便宜整洁");
    }
}
