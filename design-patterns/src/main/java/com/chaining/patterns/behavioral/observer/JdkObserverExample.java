package com.chaining.patterns.behavioral.observer;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 14:34
 */
public class JdkObserverExample {
    public static void main(String[] args) {
        YouKu youKu = new YouKu();
        youKu.addObserver(new Chai());
        youKu.addObserver(new Tom());

        youKu.postVideo();
        youKu.notifyObservers();
    }

}
