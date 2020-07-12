package com.sample.server;

import com.example.autoconfig.annotation.Provider;
import com.sample.api.IRemoteServiceSecond;

/**
 * @auther zhongshunchao
 * @date 09/07/2020 09:07
 */
@Provider(interfaceClass = IRemoteServiceSecond.class, port = 8791, weight = 3)
public class RemoteServiceImplD implements IRemoteServiceSecond {
    @Override
    public String hello(String message) {
        return ">>>>>>>RemoteServiceImplD send back :Hello Server1 "+ message;
    }
}
