/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.client;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/**
 * 
 * @author juqi
 * @version $Id: TestClientFallbackFactory.java, v 0.1 Oct 14, 2019 5:37:13 PM juqi Exp $
 */
@Component
public class TestClientFallbackFactory implements FallbackFactory<TestClient> {

    /** 
     * @see feign.hystrix.FallbackFactory#create(java.lang.Throwable)
     */
    @Override
    public TestClient create(Throwable cause) {
        return new TestClient() {

            @Override
            public String visitWebDb() {
                return "调用系统未响应,Consumer客户端提供的降级信息,此刻服务Provider已经关闭";
            }
            
        };
    }

}
