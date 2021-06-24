package com.chaining.patterns.behavioral.memento;

/**
 * <p>
 * 房屋中介
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/24 10:22
 */
public class HouseMediator extends Mediator{

    //中介有所有房东的房屋信息
    private Colleague colleague;

    @Override
    public void common(String type) {

    }

    public Colleague getColleague() {
        return colleague;
    }

    public HouseMediator setColleague(Colleague colleague) {
        this.colleague = colleague;
        return this;
    }
}
