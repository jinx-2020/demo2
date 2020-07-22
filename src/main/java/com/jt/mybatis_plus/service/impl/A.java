package com.jt.mybatis_plus.service.impl;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author jintao
 * date 2020-07-14
 */
public class A {

    private  String name;
    private HashMap<String,Object> map=new HashMap<>();
    public void getName(){
       System.out.println("11111111111111");
    }

    public static void main(String[] args) {
        HashMap map=new HashMap();
        System.out.println(map.get(null));
    }
}
