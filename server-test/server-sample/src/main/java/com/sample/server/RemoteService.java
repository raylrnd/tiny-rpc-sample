package com.sample.server;


import com.example.autoconfig.annotation.MyService;
import com.sample.api.IRemoteService;

/**
 * @auther zhongshunchao
 * @date 2020/5/21 3:00 下午
 */
@MyService(interfaceClass = IRemoteService.class)
public class RemoteService implements IRemoteService{

    @Override
    public String hello(String message) {
        System.out.println("say hello world" + message);
        return "server back :" + message;
    }
}
