package com.sample.server;


import com.example.autoconfig.annotation.Provider;
import com.example.autoconfig.annotation.Reference;
import com.sample.api.IRemoteServiceFirst;
import com.sample.api.IRemoteServiceSecond;
import com.sample.api.IRemoteServiceThird;

/**
 * @auther zhongshunchao
 * @date 2020/5/21 3:00 下午
 */
@Provider(interfaceClass = IRemoteServiceFirst.class, port = 8787, weight = 1)
public class RemoteServiceFirstImplA implements IRemoteServiceFirst {

    @Reference(async = true)
    IRemoteServiceSecond iRemoteServiceSecond;

    @Reference(async = true)
    IRemoteServiceThird iRemoteServiceThird;

    @Override
    public String hello(String message) {
        System.out.println(">>>>>>RemoteServiceImpl1 :Server2 successfully received messege" + message);
        String secondResult = iRemoteServiceSecond.hello(">>>>>>> RemoteServiceFirstImplA -> IRemoteServiceSecond : " + message);
        String thirdResult = iRemoteServiceThird.hello(">>>>>>> RemoteServiceFirstImplA -> IRemoteServiceThird : " + message);
        return "server2 back : secondResult == " + secondResult + "thirdResult" + thirdResult;
    }
}
