package com.chaining.httpserver.myservlet;

import com.chaining.httpserver.parse.WebServlet;
import com.chaining.httpserver.server.HttpRequest;
import com.chaining.httpserver.server.HttpResponse;

/**
 * 处理登录请求
 */
@WebServlet(urlPatterns = "/servlet/loginservlet")
public class LoginServlet implements HttpServlet{
    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) {
       //处理
        System.out.println("LoginServlet处理了登录请求");
    }
}