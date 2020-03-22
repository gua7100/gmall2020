package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * depict:
 * author: jyf
 * date:   2020/3/21 21:28
 */
public interface UserService {
    List<UmsMember> getAll();

    List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId);

    int addAddressInfo(String id,String addressInfo);
}
