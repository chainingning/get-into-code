package com.chaining.patterns.creational.singleton;

/**
 * <p>
 * 单例
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 16:18
 */
public class Singleton {

    private static final Singleton instance;

    static {
        instance = new Singleton();
    }

    public Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

}
