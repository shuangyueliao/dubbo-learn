package com.shuang.dubbo.consumer.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
@EnableDubbo(scanBasePackages = "com.shuang.dubbo.consumer.Annotation")
@ComponentScan(value = {"com.shuang.dubbo.consumer.Annotation"})
public class ConsumerConfiguration {
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-consumer");
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("qos.enable", "true");
        stringStringHashMap.put("qos.accept.foreign.ip", "false");
        stringStringHashMap.put("qos.port", "33333");
        applicationConfig.setParameters(stringStringHashMap);
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(30000);
        return consumerConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost");
        registryConfig.setPort(2181);
        return registryConfig;
    }
}
