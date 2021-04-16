package com.wcy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wcy.common.utils.PageUtils;
import com.wcy.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author wangchunyu
 * @email wangchunyu@gmail.com
 * @date 2021-04-16 21:38:47
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

