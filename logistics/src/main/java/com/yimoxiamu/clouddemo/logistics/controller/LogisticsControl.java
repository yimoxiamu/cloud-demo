package com.yimoxiamu.clouddemo.logistics.controller;

import com.yimoxiamu.clouddemo.logistics.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LogisticsControl
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 17:38
 * @VERSION 1.0
 **/
@RestController
@RequestMapping(value = "/logistics")
public class LogisticsControl {

    @Autowired
    LogisticsService logisticsService;
    @RequestMapping(value = "/pull")
    void pullLogistics(@RequestParam(name = "orderId") String orderId){
        logisticsService.pullLogistics(orderId);
    }
}
