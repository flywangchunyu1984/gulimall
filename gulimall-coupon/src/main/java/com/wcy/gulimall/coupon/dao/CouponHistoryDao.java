package com.wcy.gulimall.coupon.dao;

import com.wcy.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:48:25
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
