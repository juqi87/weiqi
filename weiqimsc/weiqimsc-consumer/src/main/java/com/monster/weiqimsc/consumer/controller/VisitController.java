/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.consumer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.monster.weiqimsc.client.TestClient;

/**
 * 
 * @author juqi
 * @version $Id: VisitController.java, v 0.1 Sep 23, 2019 2:44:29 PM juqi Exp $
 */
@RestController
public class VisitController {
    
    private Logger logger = Logger.getLogger(VisitController.class);

    private static final String REST_URL_PREFIX = "http://WEIQIMSC-PROVIDER";
    
    @Autowired
    private TestClient testClient;
    
    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/consumer/visit")
    public String visit() {
        logger.info("进入/consumer/visit");
        return restTemplate.postForObject(REST_URL_PREFIX + "/visitWebDb.jsp", null, String.class);
    }
    
    @RequestMapping(value = "/consumer/ribbonVisit")
    public String ribbonVisit() {
        logger.info("进入/consumer/ribbonVisit");
        return testClient.visitWebDb();
    }
}
