package com.wcy.gulimall.order.dao;

import com.wcy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 17:54:11
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
