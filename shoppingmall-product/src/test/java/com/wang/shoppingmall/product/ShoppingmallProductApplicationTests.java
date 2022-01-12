package com.wang.shoppingmall.product;

import com.wang.shoppingmall.product.entity.BrandEntity;
import com.wang.shoppingmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShoppingmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
       /* BrandEntity brandEntity=new BrandEntity();
       // brandEntity.setDescript("");
        brandEntity.setName("苹果");
        brandService.save(brandEntity);
        System.out.println("保存成功.....");
*//*
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setBrandId(1L);
       // brandEntity.setName("华为");
        brandEntity.setDescript("国产自主研发");
        brandService.updateById(brandEntity);*/

      /*  List<BrandEntity> list= brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1l));
        list.forEach((item)->{
            System.out.println(item);
        });
*/
        List<BrandEntity> list =brandService.list();
        list.forEach((i)->{
            System.out.println(i);
        });
    }

}
