package com.chaining.patterns.creational.singleton;

/**
 * <p>
 * 注册内部类方式的单例模式,线程安全
 * 需要明确实现懒加载（lazy loading）时，使用登记式/静态内部类方式
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 16:32
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
        //防止反射攻击
        throw new IllegalArgumentException("HungrySingleton not allow be constructed");
    }

    //每一个关键字都不是多余的,static 为了使单例模式的空间共享,保证这个方法不被重写,重载
    private static class LazyHolder {
        private static final Singleton LAZY = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.LAZY;
    }

    /**
     * 重写 readResolve 方法`java.io.ObjectStreamClass` 类在反序列初始化对象时会去判断这个方法
     * 还是会创建两次,但是发生在 JVM 层面,相对安全,之前反序列化的对象也会被 GC 回收
     *
     * @see java.io.ObjectStreamClass #invokeReadResolve
     */
    private Object readResolve() {
        return LazyHolder.LAZY;
    }
}
