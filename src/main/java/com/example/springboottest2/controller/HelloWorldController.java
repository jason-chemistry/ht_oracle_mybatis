package com.example.springboottest2.controller;

import com.example.springboottest2.service.serviceImpl.CeshiServiceImpl;
import jdk.nashorn.api.scripting.ScriptUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @Resource
    private CeshiServiceImpl ceshiService;

    /**
     * 测试接口是否通畅
     * @return
     */
    @RequestMapping("/ceshi")
    public String ceshi(){
        return "ceshii";
    }

    /**
     * 测试到mybatis是否通畅
     * @return
     */
    @RequestMapping("/query")
    public String query(){
        System.out.println(ceshiService.query());
        return ceshiService.query();
    }


}
