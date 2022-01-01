package com.wang.shoppingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.shoppingmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 11:10:50
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

