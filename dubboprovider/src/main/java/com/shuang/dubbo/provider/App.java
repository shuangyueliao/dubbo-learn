package com.shuang.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
        classPathXmlApplicationContext.start();
        System.in.read();

    }
}
