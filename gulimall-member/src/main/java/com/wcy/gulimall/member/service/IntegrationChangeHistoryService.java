package com.wcy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wcy.common.utils.PageUtils;
import com.wcy.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:56:25
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

