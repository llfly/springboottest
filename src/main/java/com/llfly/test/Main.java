package com.llfly.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by fangyou on 2018/1/14.
 */
@SpringBootApplication  // 开启组建扫描和自动配置
public class Main {
    public static void main(String [] args) {
        SpringApplication.run(Main.class, args);
    }   // 负责启动引导应用程序
}

/*

@SpringBootApplication将三个有用的注解组合在了一起:
- Spring的 @Configuration: 标明该类使用 Spring 基于 Java 的配置
- Spring的@ComponentScan: 启用组件扫描，这样 Web 控制器类和其他组件才能被自动发现并注册为 Spring 应用程序上下文里的 Bean
- Spring Boot的 @EnableAutoConfiguration:这个不起眼的小注解也可以称为 @Abracadabra1，就是这一行配置开启了Spring Boot自动配置的魔力，让你不用再写配置
*/


