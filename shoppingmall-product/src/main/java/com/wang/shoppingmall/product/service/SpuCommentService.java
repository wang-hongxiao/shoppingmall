package com.wang.shoppingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.shoppingmall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 11:10:50
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

