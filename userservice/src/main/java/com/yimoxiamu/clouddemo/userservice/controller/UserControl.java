package com.yimoxiamu.clouddemo.userservice.controller;

import com.yimoxiamu.clouddemo.userservice.api.indentService;
import com.yimoxiamu.clouddemo.userservice.service.UserVipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserControl
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 16:47
 * @VERSION 1.0
 **/
@RequestMapping(value = "/user")
@RestController
@Slf4j
public class UserControl {
    @Autowired
    UserVipService userVipService;

    @RequestMapping(value = "/countVip")
    public void countVip(@RequestParam(name = "orderId") String orderId){
        userVipService.doCount(orderId);
    }

}
