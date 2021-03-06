package com.leo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leo.common.utils.PageUtils;
import com.leo.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Leo
 * @email 
 * @date 2020-06-10 21:53:20
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

