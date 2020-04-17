package com.zhifa.starter.autoConfig;

import com.zhifa.starter.properties.StarterServiceProperties;
import com.zhifa.starter.service.ZhifaStarterService;
import com.zhifa.starter.service.impl.ZhifaStarterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ZhifaStarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {
    @Autowired
    private StarterServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    ZhifaStarterService starterService (){
        /*StarterService的实现类StarterServiceImpl*/
        return new ZhifaStarterServiceImpl(properties.getConfig());
    }
}
