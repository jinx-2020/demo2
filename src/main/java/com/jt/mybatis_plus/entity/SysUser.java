package com.jt.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-07-10 10:07:47
 */
@Data
@TableName("sys_user")
public class SysUser implements Serializable {
    private static final long serialVersionUID = 233911101457336485L;
    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;
    /**
     * 账号
     */
    private String usercode;
    /**
     * 姓名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐
     */
    private String salt;
    /**
     * 账号是否锁定，1：锁定，0未锁定
     */
    private String locked;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;


}