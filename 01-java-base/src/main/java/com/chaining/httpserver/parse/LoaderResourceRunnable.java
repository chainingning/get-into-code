package com.chaining.httpserver.parse;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class LoaderResourceRunnable implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        //执行parse方法
        //ParseServletConfig parseServletConfig = new PropertiesParseServletConfig();
        //parseServletConfig.parse();

//        ParseServletConfig parseServletConfig = new XMLParseServletConfig();
//        parseServletConfig.parse();
        ParseServletConfig parseServletConfig = new AnnoParseServletConfig();
        parseServletConfig.parse();
    }
}
