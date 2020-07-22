package com.jt.mybatis_plus.controller;

import com.jt.mybatis_plus.entity.SysUser;
import com.jt.mybatis_plus.entity.User;
import com.jt.mybatis_plus.service.SysUserService;
import com.jt.mybatis_plus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2020-07-10 10:07:54
 */
@Slf4j
@RestController
public class SysUserController {
    /**
     * 服务对象
     */

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private UserService userService;

    @GetMapping("qqq")
    public List selectOne() {
       List list=new ArrayList();
     List<SysUser>  list1= sysUserService.getAll();
     List<User>  list2= userService.getAll();
     list.add(list1);
     list.add(list2);
     return list;
    }

    @GetMapping("qq")
    public List selectOne2(String id) {
       List<Map<String,Object>> list =sysUserService.findById(id);
       return list;
    }

}