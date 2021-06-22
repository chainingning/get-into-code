package com.chaining.patterns.behavioral.strategy;

/**
 * <p>
 * 支付策略
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/22 10:04
 */
public interface PayStrategy {
    void pay(String account,int paymentAmount);
}
