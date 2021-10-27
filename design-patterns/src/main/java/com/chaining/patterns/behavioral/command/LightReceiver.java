package com.chaining.patterns.behavioral.command;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/27 9:33
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开了");
    }

    public void off(){
        System.out.println("电灯关闭了");
    }

}
