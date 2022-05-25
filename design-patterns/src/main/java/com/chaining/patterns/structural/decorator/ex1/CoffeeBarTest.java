package com.chaining.patterns.structural.decorator.ex1;

import com.chaining.patterns.structural.decorator.ex1.component.DeCaf;
import com.chaining.patterns.structural.decorator.ex1.component.Drink;
import com.chaining.patterns.structural.decorator.ex1.component.LongBlack;
import com.chaining.patterns.structural.decorator.ex1.decorator.Chocolate;
import com.chaining.patterns.structural.decorator.ex1.decorator.Milk;
import org.junit.Test;

public class CoffeeBarTest {

    @Test
    public void tes1() {
        // 装饰者模式下的订单：2 份巧克力+一份牛奶的 LongBlack

        // 1.  点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用 1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        // 2. order 加入一份牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());

        // 3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶  加入一份巧克力	费 用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());

        // 3. order 加入一份巧克力
        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶  加入 2 份巧克力	费 用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入 2 份巧克力 描述 = " + order.getDes());


        System.out.println("===========================");

        Drink order2 = new DeCaf();

        System.out.println("order2 无因咖啡	费 用 =" + order2.cost());
        System.out.println("order2 无因咖啡 描述 = " + order2.getDes());
        order2 = new Milk(order2);
        System.out.println("order2 无因咖啡  加入一份牛奶	费 用 =" + order2.cost());
        System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDes());

    }
}
