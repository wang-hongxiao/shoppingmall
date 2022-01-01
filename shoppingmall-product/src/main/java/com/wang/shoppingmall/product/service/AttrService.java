package com.wang.shoppingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.shoppingmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 11:10:50
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

