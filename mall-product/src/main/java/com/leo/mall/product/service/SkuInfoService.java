package com.leo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leo.common.utils.PageUtils;
import com.leo.mall.product.entity.SkuInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * sku信息
 *
 * @author leo
 * @email 
 * @date 2020-06-02 22:11:01
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);

    List<SkuInfoEntity> getSkusBySpuId(Long spuId);
}

