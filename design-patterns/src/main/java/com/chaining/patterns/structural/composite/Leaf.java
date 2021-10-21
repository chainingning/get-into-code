package com.chaining.patterns.structural.composite;

/**
 * <p>
 * 叶子对象，叶子对象不再包含其他子对象
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/21 15:52
 */
public class Leaf extends Component{

    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    @Override
    public void someOperation() {
        //do something
    }
}
