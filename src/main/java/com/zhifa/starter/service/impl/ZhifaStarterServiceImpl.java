package com.zhifa.starter.service.impl;

import com.zhifa.starter.service.ZhifaStarterService;

public class ZhifaStarterServiceImpl implements ZhifaStarterService {
    private String config;

    public ZhifaStarterServiceImpl() {
    }

    public ZhifaStarterServiceImpl(String config) {
        this.config = config;
    }

    @Override
    public void say() {
        System.out.println("我是来自配置文件的配置属性："+config);
    }
}
