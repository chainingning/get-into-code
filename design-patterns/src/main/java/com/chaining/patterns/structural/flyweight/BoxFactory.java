package com.chaining.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/26 13:46
 */
public class BoxFactory {

    /**
     * 集合，充当池的作用
     */
    private static HashMap<String,AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
