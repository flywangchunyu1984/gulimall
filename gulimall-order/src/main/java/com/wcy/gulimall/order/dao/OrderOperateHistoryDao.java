package com.wcy.gulimall.order.dao;

import com.wcy.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 17:54:11
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
