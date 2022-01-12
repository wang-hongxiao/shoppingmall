package com.wang.shoppingmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wang.shoppingmall.coupon.dao")
@SpringBootApplication
public class ShoppingmallCouponApplication {

    public static void main(String[] args) {

        SpringApplication.run(ShoppingmallCouponApplication.class, args);
    }

}
