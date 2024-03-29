/**
 * 
 * 上海云之富金融信息服务有限公司
 * Copyright (c) 2014-2019 YunCF,Inc.All Rights Reserved.
 */
package com.monster.weiqimsc.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.weiqimsc.provider.dao.TestVisitMapper;

/**
 * 
 * @author juqi
 * @version $Id: VisitController.java, v 0.1 Sep 9, 2019 6:26:49 PM juqi Exp $
 */
@RestController
public class VisitController {

    @Autowired
    private TestVisitMapper testVisitMapper;
    
    @RequestMapping("/visitWebDb.jsp")
    public String visitWebDb(ModelMap model, HttpServletRequest request) {
//        if(1==1) {
//            throw new RuntimeException("我发生系统错误8002!");
//        }
        return testVisitMapper.getTestVisit()+"8002";
    }
    
}
