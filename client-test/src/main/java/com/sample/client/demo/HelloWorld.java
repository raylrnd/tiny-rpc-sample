package com.sample.client.demo;

import com.example.autoconfig.annotation.MyReference;
import com.sample.api.IRemoteService;
import org.springframework.stereotype.Component;

/**
 * @auther zhongshunchao
 * @date 2020/5/21 3:01 下午
 */
@Component
public class HelloWorld {
    //client端通过接口的全限定名去zk注册中心寻找服务地址
    @MyReference(async = true, callback = true)
    public IRemoteService helloService;

    public String run() {
        String result = helloService.hello("zhong shun chao");
        return result;
    }

}
