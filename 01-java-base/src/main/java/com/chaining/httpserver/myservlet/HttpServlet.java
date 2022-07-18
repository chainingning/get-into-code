package com.chaining.httpserver.myservlet;

import com.chaining.httpserver.server.HttpRequest;
import com.chaining.httpserver.server.HttpResponse;

/**
 * <p>
 * 规范servlet类的
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface HttpServlet {
    //定义业务处理的方法
    public abstract void service(HttpRequest httpRequest, HttpResponse httpResponse);
}
