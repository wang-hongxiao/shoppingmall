package com.wang.shoppingmall.order.dao;

import com.wang.shoppingmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 18:28:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
