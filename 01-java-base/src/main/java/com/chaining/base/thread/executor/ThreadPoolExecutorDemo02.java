package com.chaining.base.thread.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class ThreadPoolExecutorDemo02 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor;

        /**
         * 核心线程数量为1 ， 最大线程池数量为3, 任务容器的容量为1 ,空闲线程的最大存在时间为20s
         */
        threadPoolExecutor = new ThreadPoolExecutor(1, 3, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());

        for(int i = 0; i < 5; i++) {
            final int y =i;
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName() + "---->> 执行了任务" + y);
            });

        }
    }
}
