package com.shuang.dubbo.consumer.Annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shuang.dubbo.provider.service.annotation.ProviderServiceAnnotation;
import org.springframework.stereotype.Component;

@Component("annotatedConsumer")
public class ConsumerAnnotationService {
    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.SayHelloAnnotation(name);
    }
}
