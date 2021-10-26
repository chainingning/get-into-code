package com.chaining.patterns.behavioral.template.ex1;

/**
 * <p>
 * 一个较为完整的模板方法定义
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/26 16:12
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod(){

    }

    /**
     * 具体操作1，算法中的步骤，固定实现，而且子类不需要访问
     */
    private void operation1(){
        //在这里具体的实现
    }

    /**
     * 具体操作2，算法中的步骤，固定实现，子类可能需要访问
     * 不可以被覆盖，因此是final类型
     */
    protected final void operation2(){
        //在这里具体的实现
    }

    /**
     * 原语操作1，算法中的必要操作，父类无法确定如何真正实现，需要子类来实现
     */
    protected abstract void doPrimitiveOperation1();

    /**
     * 原语操作2，算法中的必要操作，父类无法确定如何真正实现，需要子类来实现
     */
    protected abstract void doPrimitiveOperation2();

    /**
     * 钩子操作，算法中的步骤，不一定需要提供默认实现
     * 由子类选择并具体实现
     */
    protected void hookOperation1(){
        //在这里具体的实现
    }

    /**
     * 工厂方法，创建某个对象，这里用Object代替了，在算法实现中可能需要
     * @return 创建的某个算法实现需要的对象
     */
    protected abstract Object creatOneObject();
}
