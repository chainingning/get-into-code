package com.chaining.patterns.behavioral.template.ex1;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/11/09 9:59
 */
public class TemplateEx1Client {

    public static void main(String[] args) {

        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk =  new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk =  new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }

}
