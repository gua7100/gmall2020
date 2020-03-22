package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * depict:
 * author: jyf
 * date:   2020/3/21 23:00
 */
public interface UmsMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();
}
