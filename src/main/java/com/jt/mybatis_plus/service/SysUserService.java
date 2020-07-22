package com.jt.mybatis_plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jt.mybatis_plus.entity.SysUser;

import java.util.List;
import java.util.Map;

/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2020-07-10 10:07:50
 */
public interface SysUserService extends IService<SysUser> {


    void SAVE(SysUser sysUser);

    List<Map<String,Object>> findById(String id);

    List<SysUser> getAll();
}