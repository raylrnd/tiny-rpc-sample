package com.sample.server;


import com.example.autoconfig.annotation.Provider;
import com.example.autoconfig.annotation.Reference;
import com.sample.api.IRemoteService;
import com.sample.api.IRemoteService1;

/**
 * @auther zhongshunchao
 * @date 2020/5/21 3:00 下午
 */
@Provider(interfaceClass = IRemoteService.class, port = 8787, weight = 1)
public class RemoteServiceImpl1 implements IRemoteService {

    @Reference(async = true)
    IRemoteService1 iRemoteService1;

    @Override
    public String hello(String message) {
        System.out.println(">>>>>>RemoteServiceImpl1 :Server2 successfully received messege" + message);
        iRemoteService1.hello1(">>>>>>> RemoteServiceImpl1 -> server1 : " + message);
        return "server back :" + message;
    }
}
