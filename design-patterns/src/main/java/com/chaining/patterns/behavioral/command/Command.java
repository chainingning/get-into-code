package com.chaining.patterns.behavioral.command;

/**
 * <p>
 * 命令接口
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/27 9:30
 */
public interface Command {
    /**
     * 执行动作(操作)
     */
    void execute();

    /**
     * 撤销动作(操作)
     */
    void undo();
}
