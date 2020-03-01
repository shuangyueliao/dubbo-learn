package com.shuang.dubbo.consumer;

import com.shuang.dubbo.consumer.Annotation.ConsumerAnnotationService;
import com.shuang.dubbo.consumer.configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        String hello = consumerAnnotationService.doSayHello("annotation");
        System.out.println("result: " + hello);
    }
}
