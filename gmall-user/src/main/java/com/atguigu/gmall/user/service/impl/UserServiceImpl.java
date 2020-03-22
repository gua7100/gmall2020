package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMapper;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * depict:
 * author: jyf
 * date:   2020/3/21 21:29
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UmsMapper umsMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAll() {
        List<UmsMember> umsMemberList = umsMapper.selectAll();

        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress  = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddressList;
    }

    @Override
    public int addAddressInfo(String id, String addressInfo) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setId(id);
        umsMemberReceiveAddress.setDetailAddress(addressInfo);
        int insertStatus = umsMemberReceiveAddressMapper.insert(umsMemberReceiveAddress);
        return insertStatus;
    }
}
