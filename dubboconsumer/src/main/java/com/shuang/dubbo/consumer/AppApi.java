package com.shuang.dubbo.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.shuang.dubbo.provider.service.ProviderService;

public class AppApi {
    public static void main(String[] args) {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("consumer");
        application.setOwner("shuang");

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://localhost:2181");

        ReferenceConfig<ProviderService> reference = new ReferenceConfig<ProviderService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface(ProviderService.class);

        ProviderService providerService = reference.get();
        String s = providerService.SayHello("hello dubbo! I am shuangyueliao");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + s);
    }
}
