package com.wcy.gulimall.coupon.dao;

import com.wcy.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:48:25
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
