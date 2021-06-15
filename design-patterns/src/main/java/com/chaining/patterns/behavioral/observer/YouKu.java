package com.chaining.patterns.behavioral.observer;

import java.util.Observable;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 14:27
 */
public class YouKu extends Observable {
    /**
     * 发布视频
     */
    public void postVideo(){
        super.setChanged();
    }
}
