package com.chaining.patterns.behavioral.command;

/**
 * <p>
 * 没有任何命令，即空执行，用于初始化每一个按钮，当调用空命令时，对象什么都不做
 * 其实，这是一种设计模式，可以省掉对空判断
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/27 9:54
 */
public class NoCommand implements Command{

    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {

    }
}
