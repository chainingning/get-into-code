package com.chaining.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 14:32
 */
public abstract class VideoObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("视频更新啦,快来看");
        watch(o, arg);
    }

    protected abstract void watch(Observable o, Object arg);
}
