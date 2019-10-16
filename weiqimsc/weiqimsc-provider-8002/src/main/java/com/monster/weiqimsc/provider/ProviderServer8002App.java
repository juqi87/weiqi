/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author juqi
 * @version $Id: ProvicerServerApp.java, v 0.1 Sep 9, 2019 6:38:25 PM juqi Exp $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderServer8002App {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServer8002App.class, args);
    }
    
}
