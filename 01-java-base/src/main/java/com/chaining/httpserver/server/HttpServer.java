package com.chaining.httpserver.server;

import com.chaining.httpserver.parse.LoaderResourceRunnable;
import lombok.SneakyThrows;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class HttpServer {


    @SneakyThrows
    public static void main(String[] args) {

        //开启一个线程去解析配置文件
        new Thread(new LoaderResourceRunnable()).start();

        //1.打开服务端通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //2.让这个通道绑定一个端口
        serverSocketChannel.bind(new InetSocketAddress(8888));
        //3.设置通道为非阻塞
        serverSocketChannel.configureBlocking(false);
        //4.打开一个选择器
        Selector selector = Selector.open();

        //5.绑定选择器和服务端通道
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);


        while (true) {
            //6.选择器会监视通道的状态.
            int count = selector.select();

            if (count!=0) {
                //7.会遍历所有的服务端通道.看谁准备好了,谁准备好了,就让谁去连接.
                //获取所有服务端通道的令牌,并将它们都放到一个集合中,将集合返回.
            }
        }


    }
}
