package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * depict:用户controller
 * author: jyf
 * date:   2020/3/21 21:28
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAll(){
        List<UmsMember> umsMemberList =userService.getAll();
        return umsMemberList;
    }


    /**
     * 通过用户号查询收货地址
     * @param memberId
     * @return
     */
    @RequestMapping("getMemberAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressesList =userService.getAddressByMemberId(memberId);
        return umsMemberReceiveAddressesList;
    }

    @RequestMapping("addMemberAddress")
    @ResponseBody
    public String addMemberAddress(String id,String addressInfo){
        int addStatus = userService.addAddressInfo(id, addressInfo);
        if(addStatus ==1){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }

    /**
     * hello 测试
     * @return
     */
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

}
