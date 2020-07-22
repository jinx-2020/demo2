package com.jt.mybatis_plus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jt.mybatis_plus.dao.SysUserDao;
import com.jt.mybatis_plus.entity.SysUser;
import com.jt.mybatis_plus.entity.TableEnum;
import com.jt.mybatis_plus.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2020-07-10 10:07:51
 */
@Service("sysUserService")
@Transactional(rollbackFor = Exception.class)
@DS(TableEnum.master)
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public void SAVE(SysUser sysUser) {
        sysUserDao.insert(sysUser);
    }

    @Override
    public List<Map<String,Object>> findById(String id) {
        List<Map<String, Object>> daoById = sysUserDao.findById("id","username",id);
        return daoById;
    }

    @Override
    public List<SysUser> getAll() {
        return sysUserDao.selectList(new QueryWrapper<SysUser>().lambda());
    }
}