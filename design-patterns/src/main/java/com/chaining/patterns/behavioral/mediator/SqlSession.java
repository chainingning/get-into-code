package com.chaining.patterns.behavioral.mediator;

import java.util.List;

/**
 * <p>
 * 这⾥里里定义了了对数据库操作的查询接⼝口，分为查询⼀一个结果和查询多个结果，同时包括有参数和没有
 * 参数的⽅方法。
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 9:16
 */
public interface SqlSession {

    <T> T selectOne(String statement);
    <T> T selectOne(String statement,Object parameter);

    <T> List<T> selectList(String statement);
    <T> List<T> selectList(String statement,Object parameter);

    void close();

}
