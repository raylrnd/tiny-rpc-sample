package com.sample.server;

import com.example.autoconfig.annotation.Provider;
import com.example.autoconfig.annotation.Reference;
import com.sample.api.IRemoteService;
import com.sample.api.IRemoteService1;


/**
 * @auther zhongshunchao
 * @date 27/06/2020 10:08
 */
@Provider(interfaceClass = IRemoteService.class, port = 8789, weight = 3)
public class RemoteServiceImpl3 implements IRemoteService {

    @Reference(async = true)
    IRemoteService1 iRemoteService1;

    @Override
    public String hello(String message) {
        System.out.println(">>>>>>RemoteServiceImpl3 :Server2 successfully received messege" + message);
        iRemoteService1.hello1(">>>>>>> RemoteServiceImpl3 -> server1 : " + message);
        return "server back :" + message;
    }
}
