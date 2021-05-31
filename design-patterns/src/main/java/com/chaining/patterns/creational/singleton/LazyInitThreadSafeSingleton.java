package com.chaining.patterns.creational.singleton;

/**
 * <p>
 * 懒加载单例模式(线程安全) 双检锁
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 16:27
 */
public class LazyInitThreadSafeSingleton {

    /**
     * CPU执行的时候会转换成 JVM指令执行,防止指令重排序 volatile
     */
    private static volatile Singleton INSTANCE = null;

    private LazyInitThreadSafeSingleton(){
        throw new IllegalArgumentException("HungrySingleton not allow be constructed");
    }
    
    /**
     * <p>双检锁方式单例<p/>
     *
     * @date 2021/5/31 16:29
     * @param null 
     * @return Singleton
     */
    public static Singleton getInstance(){
        if (INSTANCE == null) {
            synchronized (LazyInitThreadSafeSingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
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
