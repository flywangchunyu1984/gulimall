package com.wcy.gulimall.member.dao;

import com.wcy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:56:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
