package com.wcy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wcy.common.utils.PageUtils;
import com.wcy.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:38:47
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

