package com.jt.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author jinx
 * @since 2020-07-16 11:04:16
 */
@Data
@TableName("user")
public class User implements Serializable {
    private static final long serialVersionUID = -91010830261484230L;

    private Long id;

    private String username;

    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}