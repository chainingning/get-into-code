package com.chaining.patterns.behavioral.template.ex1;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/11/09 9:46
 */
public class RedBeanSoyaMilk extends SoyaMilk{

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    @Override
    public void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}
