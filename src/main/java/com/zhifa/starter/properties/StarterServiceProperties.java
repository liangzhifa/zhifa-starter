package com.zhifa.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("zhifa.service")
public class StarterServiceProperties {
    private String config="default-value";

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
