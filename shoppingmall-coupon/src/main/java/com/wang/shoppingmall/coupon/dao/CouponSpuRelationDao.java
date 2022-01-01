package com.wang.shoppingmall.coupon.dao;

import com.wang.shoppingmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 18:47:23
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}