package com.yimoxiamu.clouddemo.indentservice.controller;

import com.yimoxiamu.clouddemo.indentservice.api.LogisticsApi;
import com.yimoxiamu.clouddemo.indentservice.api.UserApi;
import com.yimoxiamu.clouddemo.indentservice.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndentControl
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 16:40
 * @VERSION 1.0
 **/
@RestController
@RequestMapping(value = "/indent")
public class IndentControl {

    @Autowired
    UserApi userApi;
    @Autowired
    LogisticsApi logisticsApi;
    @Autowired
    IndentService indentService;

    @GetMapping
    public String hello(@RequestParam(value = "orderId") String orderId){
        indentService.countIndent(orderId);
        userApi.countVip(orderId);
        logisticsApi.pullLogistics(orderId);
        return orderId;
    }
}
