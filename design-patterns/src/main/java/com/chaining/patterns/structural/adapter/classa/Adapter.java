package com.chaining.patterns.structural.adapter.classa;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/02 8:56
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }

    public static void main(String[] args) {
        Target target = new Adapter();
        target.sampleOperation2();
    }
}
