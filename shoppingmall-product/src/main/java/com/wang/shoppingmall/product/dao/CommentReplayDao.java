package com.wang.shoppingmall.product.dao;

import com.wang.shoppingmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 11:10:50
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
