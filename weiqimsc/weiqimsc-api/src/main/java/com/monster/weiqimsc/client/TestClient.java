/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author juqi
 * @version $Id: TestClient.java, v 0.1 Oct 9, 2019 11:26:31 AM juqi Exp $
 */
@FeignClient(value = "WEIQIMSC-PROVIDER", fallbackFactory=TestClientFallbackFactory.class)
public interface TestClient {

    @RequestMapping(value = "/visitWebDb.jsp", method = RequestMethod.GET)
    public String visitWebDb();
    
}
