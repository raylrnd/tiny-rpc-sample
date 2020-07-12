package com.sample.server;

import com.example.autoconfig.annotation.Provider;

import com.example.autoconfig.annotation.Reference;
import com.sample.api.IRemoteServiceFirst;
import com.sample.api.IRemoteServiceSecond;
import com.sample.api.IRemoteServiceThird;


/**
 * @auther zhongshunchao
 * @date 27/06/2020 10:07
 */
@Provider(interfaceClass = IRemoteServiceFirst.class, port = 8788, weight = 2)
public class RemoteServiceFirstImplB implements IRemoteServiceFirst {

    @Reference(async = true)
    IRemoteServiceSecond iRemoteServiceSecond;

    @Reference(async = true)
    IRemoteServiceThird iRemoteServiceThird;

    @Override
    public String hello(String message) {
        System.out.println(">>>>>>RemoteServiceImpl1 :Server2 successfully received messege" + message);
        String secondResult = iRemoteServiceSecond.hello(">>>>>>> RemoteServiceFirstImplB -> IRemoteServiceSecond : " + message);
        String thirdResult = iRemoteServiceThird.hello(">>>>>>> RemoteServiceFirstImplB -> IRemoteServiceThird : " + message);
        return "server2 back : secondResult == " + secondResult + "thirdResult" + thirdResult;
    }
}
