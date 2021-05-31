package com.chaining.patterns.creational.singleton;

/**
 * <p>
 * 懒加载单例模式(线程安全)
 * - 优点：第一次调用才初始化，避免内存浪费。
 * - 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。 getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 16:25
 */
public class LazyInitThreadSafeSyncSingleton {

    private static Singleton INSTANCE = null;

    private LazyInitThreadSafeSyncSingleton() {
        //防止反射攻击
        throw new IllegalArgumentException("HungrySingleton not allow be constructed");
    }

    public static synchronized Singleton getInstance(){
        if (INSTANCE == null) {
            return new Singleton();
        }
        return INSTANCE;
    }

    /**
     * 重写 readResolve 方法`java.io.ObjectStreamClass` 类在反序列初始化对象时会去判断这个方法
     * 还是会创建两次,但是发生在 JVM 层面,相对安全,之前反序列化的对象也会被 GC 回收
     *
     * @see java.io.ObjectStreamClass
     */
    private Object readResolve() {
        return INSTANCE;
    }

}
