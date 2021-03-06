package com.chaining.patterns.behavioral.template.ex1;

/**
 * <p>
 * 抽象类，表示豆浆
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/11/08 14:44
 */
public abstract class SoyaMilk {
    /**
     * 模版方法，final修饰，不让子类去覆盖
     */
    final void make() {
        select();

        if(customerWantCondiments()){
            addCondiments();
        }

        soak();
        beat();
    }

    //选材料
    void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    public abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
    }

    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

    /**
     * 钩子方法，决定是否需要添加配料
     * @return
     */
    boolean customerWantCondiments(){
        return true;
    }
}
