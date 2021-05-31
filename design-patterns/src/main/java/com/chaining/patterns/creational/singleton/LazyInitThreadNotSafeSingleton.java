package com.chaining.patterns.creational.singleton;

/**
 * <p>
 * 懒加载单例模式--线程不安全
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 16:21
 */
public class LazyInitThreadNotSafeSingleton {

    private static Singleton INSTANCE = null;

    private LazyInitThreadNotSafeSingleton() {
        //防止反射攻击
        throw new IllegalArgumentException("HungrySingleton not allow be constructed");
    }

    private  Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    /**
     * 重写 readResolve 方法`java.io.ObjectStreamClass` 类在反序列初始化对象时会去判断这个方法
     * 还是会创建两次,但是发生在 JVM 层面,相对安全,之前反序列化的对象也会被 GC 回收
     *
     * @see java.io.ObjectStreamClass #invokeReadResolve
     */
    private Object readResolve() {
        return INSTANCE;
    }

}
