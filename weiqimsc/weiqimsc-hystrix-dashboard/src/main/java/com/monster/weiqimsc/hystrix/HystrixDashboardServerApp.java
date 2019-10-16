/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 熔断器可视化界面，可做监控作用
 * @author juqi
 * @version $Id: HystrixServerApp.java, v 0.1 Sep 20, 2019 10:45:32 AM juqi Exp $
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardServerApp {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardServerApp.class, args);
    }
    
}
