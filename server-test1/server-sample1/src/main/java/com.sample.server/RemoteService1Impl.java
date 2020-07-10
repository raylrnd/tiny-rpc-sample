package com.sample.server;

import com.example.autoconfig.annotation.Provider;
import com.sample.api.IRemoteService1;

/**
 * @auther zhongshunchao
 * @date 09/07/2020 09:07
 */
@Provider(interfaceClass = IRemoteService1.class, port = 8791, weight = 3)
public class RemoteService1Impl implements IRemoteService1 {
    @Override
    public String hello1(String message) {
        return ">>>>>>>RemoteService1Impl send back :Hello Server1 "+ message;
    }
}
