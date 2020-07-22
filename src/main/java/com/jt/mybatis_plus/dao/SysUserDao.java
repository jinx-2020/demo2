package com.jt.mybatis_plus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.mybatis_plus.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * (SysUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-10 10:07:49
 */
public interface SysUserDao extends BaseMapper<SysUser> {


    @Select("select ${id},${username} from ${condition}  order by ${} Desc limit 1")
    List<Map<String,Object>> findById(@Param("id") String id, @Param("username") String username, @Param("condition") String condition);
}