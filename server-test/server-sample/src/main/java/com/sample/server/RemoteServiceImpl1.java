package com.sample.server;


import com.example.autoconfig.annotation.Provider;
import com.sample.api.IRemoteService;

/**
 * @auther zhongshunchao
 * @date 2020/5/21 3:00 下午
 */
@Provider(interfaceClass = IRemoteService.class, port = 8787, weight = 1)
public class RemoteServiceImpl1 implements IRemoteService {

    @Override
    public String hello(String message) {
        System.out.println("say hello world" + message);
        return "server back :" + message;
    }
}
