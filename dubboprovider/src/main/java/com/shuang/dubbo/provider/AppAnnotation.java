package com.shuang.dubbo.provider;

import com.shuang.dubbo.provider.configuration.DubboConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppAnnotation {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        System.in.read();
    }
}
