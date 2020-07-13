package com.example.test;

import com.sample.client.demo.HelloWorld;
import net.sourceforge.groboutils.junit.v1.MultiThreadedTestRunner;
import net.sourceforge.groboutils.junit.v1.TestRunnable;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConcurrentTest {

    @Autowired
    public HelloWorld helloWorld;

    @Test
    public void testThreadJunit() throws Throwable {
        //Runner数组，相当于并发多少个。
        TestRunnable[] trs = new TestRunnable [100];
        for(int i=0;i<10;i++){
            trs[i]=new ThreadA();
        }

        // 用于执行多线程测试用例的Runner，将前面定义的单个Runner组成的数组传入
        MultiThreadedTestRunner mttr = new MultiThreadedTestRunner(trs);

        // 开发并发执行数组里定义的内容
        mttr.runTestRunnables();
    }

    private class ThreadA extends TestRunnable {
        @Override
        public void runTest() throws Throwable {
            // 测试内容
            helloWorld.run();
        }
    }

}
