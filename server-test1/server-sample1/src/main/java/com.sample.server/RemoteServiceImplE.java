package com.sample.server;

import com.example.autoconfig.annotation.Provider;
import com.sample.api.IRemoteServiceThird;

/**
 * @auther zhongshunchao
 * @date 12/07/2020 18:58
 */
@Provider(interfaceClass = IRemoteServiceThird.class, port = 8792, weight = 3)
public class RemoteServiceImplE implements IRemoteServiceThird {
    @Override
    public String hello(String message) {
        return ">>>>>>>RemoteServiceImplE send back :Hello Server1 "+ message;
    }
}
