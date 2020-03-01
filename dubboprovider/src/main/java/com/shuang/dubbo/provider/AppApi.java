package com.shuang.dubbo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.shuang.dubbo.provider.service.ProviderService;
import com.shuang.dubbo.provider.service.ProviderServiceImpl;

public class AppApi {
    public static void main(String[] args) {
        ProviderService providerService = new ProviderServiceImpl();
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider");
        applicationConfig.setOwner("shuang");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:2181");

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);

        ServiceConfig<ProviderService> service = new ServiceConfig<ProviderService>();
        service.setApplication(applicationConfig);
        service.setRegistry(registryConfig);
        service.setProtocol(protocolConfig);
        service.setInterface(ProviderService.class);
        service.setRef(providerService);
        service.setVersion("1.0.0");

        service.export();
    }
}
