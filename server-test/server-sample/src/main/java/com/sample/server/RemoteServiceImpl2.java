package com.sample.server;

import com.example.autoconfig.annotation.Provider;
import com.sample.api.IRemoteService;

/**
 * @auther zhongshunchao
 * @date 27/06/2020 10:07
 */
@Provider(interfaceClass = IRemoteService.class, port = 8788, weight = 2)
public class RemoteServiceImpl2 implements IRemoteService {

    @Override
    public String hello(String message) {
        System.out.println("say hello world" + message);
        return "server back :" + message;
    }
}
