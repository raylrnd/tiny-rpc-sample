package com.sample.client;

import com.sample.client.demo.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @auther zhongshunchao
 * @date 14/06/2020 12:56
 */
@SpringBootApplication
public class ClientDemo implements CommandLineRunner {

    @Autowired
    public HelloWorld helloWorld;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ClientDemo.class);
        app.run(args);
    }

    @Override
    public void run(String... args) {
        String result = helloWorld.run();
        System.out.println(result);
    }

}
