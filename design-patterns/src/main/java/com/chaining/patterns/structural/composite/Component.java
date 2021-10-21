package com.chaining.patterns.structural.composite;

/**
 * <p>
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/21 15:26
 */
public abstract class Component {

    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    public abstract void someOperation();


    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Component child){
        //缺省的实现，抛出例外，因为叶子对象没有这个功能
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组合对象中移出组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void removeChild(Component child){
        //缺省的实现，抛出例外，因为叶子对象没有这个功能
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 返回某个索引对应的组件对象
     * @param index 索引
     */
    public Component getChildren(int index){
        //缺省的实现，抛出例外，因为叶子对象没有这个功能
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }


}
