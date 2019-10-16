/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.monster.weiqimsc.consumer.myrule.MySelfRule;

/**
 * 
 * @author juqi
 * @version $Id: ConsumerServerApp.java, v 0.1 Sep 23, 2019 11:13:02 AM juqi Exp $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name="WEIQIMSC-PROVIDER",configuration=MySelfRule.class)
@EnableFeignClients(basePackages= {"com.monster.weiqimsc"})
@ComponentScan("com.monster.weiqimsc")
public class ConsumerServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerApp.class, args);
    }
    
}
