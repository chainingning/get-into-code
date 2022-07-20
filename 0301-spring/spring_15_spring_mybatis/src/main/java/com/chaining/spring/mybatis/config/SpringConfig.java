package com.chaining.spring.mybatis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Configuration
@ComponentScan("com.chaining")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
