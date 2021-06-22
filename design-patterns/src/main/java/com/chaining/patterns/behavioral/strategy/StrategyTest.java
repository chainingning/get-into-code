package com.chaining.patterns.behavioral.strategy;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/22 10:11
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setAccount("Chaining")
                .setClosed(false)
                .setTotalCost(666);
        order.processOrder(new WechatPayStrategy());
        order.processOrder(new PaypalStrategy());
    }
}
