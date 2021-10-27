package com.chaining.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 对象结构，通常在这里对元素进行遍历，让访问者能访问到所有的元素
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:42
 */
public class ObjectStructure {

    /**
     * 示意，表示对象结构，可以是一个组合结构或者集合
     */
    private List<Element> elementList = new ArrayList<Element>();

    /**
     * 提供给客户端操作的顶层接口
     * @param visitor 客户端需要使用的访问者
     */
    public void handleRequest(Visitor visitor){
        //循环对象结构中的元素，接受访问
        for (Element element : elementList) {
            element.accept(visitor);
        }
    }

    /**
     * 组建对象结构，向对象结构中添加元素
     * 不同的对象结构有不同的构建方式
     * @param element 加入到对象结构的元素
     */
    public void addElement(Element element){
        this.elementList.add(element);
    }

}
