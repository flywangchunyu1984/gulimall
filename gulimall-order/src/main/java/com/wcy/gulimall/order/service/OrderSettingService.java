package com.wcy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wcy.common.utils.PageUtils;
import com.wcy.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 17:54:11
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

