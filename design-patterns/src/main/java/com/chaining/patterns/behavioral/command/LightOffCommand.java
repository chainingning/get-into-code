package com.chaining.patterns.behavioral.command;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/27 9:31
 */
public class LightOffCommand implements Command{

    //聚合LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {
        //调用接受者方法
        light.off();
    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {
        light.on();
    }
}
