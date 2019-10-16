/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author juqi
 * @version $Id: ZuulServerApp.java, v 0.1 Oct 9, 2019 5:03:33 PM juqi Exp $
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApp.class, args);
    }
    
}
