package com.wang.shoppingmall.member.dao;

import com.wang.shoppingmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-12 20:50:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
