package com.example.demoss.Configurations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@RefreshScope
public class ConfigProperties {
    @Value("${spring.rabbitmq.host}")
    private String rabbitHostName;
    @Value("${spring.rabbitmq.port}")
    private String rabbitPortNo;

    @Autowired
    private   ConfigProperties configProperties;


    String ivKey = "jNBDVrxfc367p4HT";
    String secretKey =  "hdQGZxDKfrLT4CPj";
    String accessKey = "$2a$08$lMT.IzAe1Y6lKwPZNI1oKe6pPnOQgNINK6cyld/xVp6HKN48kmMF2";
    String countryCode = "KE";
}
