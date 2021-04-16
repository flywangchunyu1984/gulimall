package com.wcy.gulimall.coupon.dao;

import com.wcy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:48:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}