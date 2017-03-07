/**
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 */
package com.txw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * 示例：应用配置
 * Date: 2017-03-03
 *
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SiteConfig implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(SiteConfig.class);

    @Value("${spring.profiles.active}")
    private String profiles;

    @Override
    public void run(String... args) throws Exception {
        logger.info("The spring.profiles.active is: {}", profiles);
    }

}
