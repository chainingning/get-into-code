package com.chaining.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
//声明当前类为Spring配置类
// Spring注解扫描，相当于<context:component-scan base-package="com.chaining"/>
@Configuration
//设置bean扫描路径，多个路径书写为字符串数组格式
@ComponentScan({"com.chaining.spring.annotation"})
public class SpringConfig {

}
