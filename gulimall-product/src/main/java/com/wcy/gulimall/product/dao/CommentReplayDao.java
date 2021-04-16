package com.wcy.gulimall.product.dao;

import com.wcy.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:38:47
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
