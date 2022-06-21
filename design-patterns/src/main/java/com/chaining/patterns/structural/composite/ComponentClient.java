package com.chaining.patterns.structural.composite;

import com.alibaba.fastjson.JSON;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/21 15:53
 */
public class ComponentClient {
    public static void main(String[] args) {

        //定义多个Composite对象
        Component root = new Composite();
        Component c1 = new Composite();
        Component c2 = new Composite();

        //定义多个叶子对象
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        //组合成树形的对象结构
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);

        Component oneComponent = root.getChildren(1);
        System.out.println(JSON.toJSONString(oneComponent));
    }
}
