package com.leo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leo.common.utils.PageUtils;
import com.leo.mall.product.entity.AttrGroupEntity;
import com.leo.mall.product.vo.AttrGroupWithAttrsVO;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author leo
 * @email 
 * @date 2020-06-02 22:11:01
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVO> getAttrGroupWithAttrsByCatelogId(Long catelogId);
}

