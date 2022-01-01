package com.wang.shoppingmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.common.utils.PageUtils;
import com.wang.shoppingmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wanghongxiao
 * @email 2763210788@qq.com
 * @date 2022-01-01 19:06:20
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

