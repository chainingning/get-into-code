package com.chaining.patterns.behavioral.mediator;

import com.sun.deploy.xml.XMLNode;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.Element;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/15 9:28
 */
public class SqlSessionFactoryBuilder {

    /**
     * 这个类主要⽤用于创建解析xml⽂文件的类，以及初始化SqlSession⼯工⼚厂
     * 类 DefaultSqlSessionFactory 。另外需要注意这段代码 saxReader.setEntityResolver(new
     * XMLMapperEntityResolver()); ，是为了了保证在不不联⽹网的时候⼀一样可以解析xml，否则会需要从互联
     * ⽹网获取dtd⽂文件。
     * @param reader
     * @return
     */
    public DefaultSqlSessionFactory build(Reader reader){

        return null;
    }

    /**
     * 是对xml中的元素进⾏行行获取，这⾥里里主要获取了了； dataSource 、 mappers ，⽽而这两个配置⼀一个是我们数
     * 据库的链接信息，另外⼀一个是对数据库操作语句句的解析。
     * @param  root xml根
     * @return Configuration
     */
    private Configuration parseConfiguration(Element root){
        return null;
    }

    //获取数据源配置信息
    private Map<String,String> dataSource(List<Element> list){
        Map<String, String> dataSource = new HashMap<>(4);
        Element element = list.get(0);
        return dataSource;
    }

    /**
     * 解析xml中的sql语句句配置
     * @param list element
     * @return Map
     */
    private Map<String, XMLNode> mapperElement(List<Element> list){
        Map<String, XMLNode> map = new HashMap<>();
        return map;
    }

}
