package com.chaining.patterns.behavioral.observer;

import java.util.Observable;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 14:33
 */
public class Tom extends VideoObserver{

    @Override
    protected void watch(Observable o, Object arg) {
        System.out.println("Tom 来看");
    }
}
