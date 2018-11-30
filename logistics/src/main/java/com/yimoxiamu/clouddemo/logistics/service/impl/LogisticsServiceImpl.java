package com.yimoxiamu.clouddemo.logistics.service.impl;

import com.yimoxiamu.clouddemo.logistics.service.LogisticsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName LogisticsServiceImpl
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 17:39
 * @VERSION 1.0
 **/
@Service
@Slf4j
public class LogisticsServiceImpl implements LogisticsService {
    @Override
    public void pullLogistics(String orderId) {
        log.info("订单[{}]已经发货！",orderId);
    }
}
