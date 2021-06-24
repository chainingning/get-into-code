package com.chaining.patterns.behavioral.mediator;

/**
 * <p>
 * 开启⼀一个 SqlSession ， 这⼏几乎是⼤大家在平时的使⽤用中都需要进⾏行行操作的内容。虽然你看不不⻅见，
 * 但是当你有数据库操作的时候都会获取每⼀一次执⾏行行的 SqlSession。
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 9:21
 */
public interface SqlSessionFactory {

    SqlSession openSession();

}
