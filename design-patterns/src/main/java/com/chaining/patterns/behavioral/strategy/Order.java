package com.chaining.patterns.behavioral.strategy;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/22 10:10
 */
public class Order {
    private String account;
    private int totalCost = 0;
    private boolean isClosed = false;
    public void processOrder(PayStrategy strategy) {
        strategy.pay(account, totalCost);
    }

    public String getAccount() {
        return account;
    }

    public Order setAccount(String account) {
        this.account = account;
        return this;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public Order setTotalCost(int totalCost) {
        this.totalCost = totalCost;
        return this;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public Order setClosed(boolean closed) {
        isClosed = closed;
        return this;
    }
}
