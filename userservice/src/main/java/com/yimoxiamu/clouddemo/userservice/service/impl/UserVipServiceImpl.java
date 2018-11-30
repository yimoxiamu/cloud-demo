package com.yimoxiamu.clouddemo.userservice.service.impl;

import com.yimoxiamu.clouddemo.userservice.service.UserVipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserVipServiceImpl
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 17:14
 * @VERSION 1.0
 **/
@Service
@Slf4j
public class UserVipServiceImpl implements UserVipService {
    @Override
    public void doCount(String orderId) {
        log.info("订单[{}]积分已增加!",orderId);
    }
}
