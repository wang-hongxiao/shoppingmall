package com.wang.shoppingmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* 1.整合Mybatis-Plus
 *    1)、导入依赖
 *     <!-- mybatis-plus依赖 -->
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.5.0</version>
 *         </dependency>
 *     2）、配置
 *         1、配置数据库
 *             1）、导入数据驱动。
 *             2）、在application。yml配置数据库相关信息
 *         2、配置Mybatis-Plus；
 *             1）、使用MapperScan
 *             2）、告诉mybatisplus，SQL映射文件位置
* */

@MapperScan("com.wang.shoppingmall.product.dao")
@SpringBootApplication
public class ShoppingmallProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShoppingmallProductApplication.class, args);
    }

}
