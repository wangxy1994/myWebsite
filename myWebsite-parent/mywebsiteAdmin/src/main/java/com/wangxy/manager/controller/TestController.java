package com.wangxy.manager.controller;

import com.wangxy.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    public ITestService tmpTestService;

    @RequestMapping("testmethod")
    public void testMethod(){
        System.out.println("controller层测试连通性");
        tmpTestService.testService();




    }
}
