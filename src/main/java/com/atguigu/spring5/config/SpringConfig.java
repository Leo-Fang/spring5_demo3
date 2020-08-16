package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Leo
 * @date 2020/7/27 - 14:13
 */

@Configuration //作为配置类，替代XML配置文件
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {
}
