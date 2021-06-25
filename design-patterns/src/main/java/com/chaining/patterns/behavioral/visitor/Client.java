package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:50
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        //创建要加入对象结构的元素
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        //把元素加入对象结构
        os.addElement(elementA);
        os.addElement(elementB);

        //创建访问者
        Visitor visitor1 = new ConcreteVisitor1();
        os.handleRequest(visitor1);
    }
}
