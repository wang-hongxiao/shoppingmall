package com.wang.shoppingmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.common.utils.PageUtils;
import com.wang.common.utils.Query;

import com.wang.shoppingmall.coupon.dao.SmsSeckillSkuNoticeDao;
import com.wang.shoppingmall.coupon.entity.SmsSeckillSkuNoticeEntity;
import com.wang.shoppingmall.coupon.service.SmsSeckillSkuNoticeService;


@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNoticeEntity> implements SmsSeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuNoticeEntity> page = this.page(
                new Query<SmsSeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SmsSeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}