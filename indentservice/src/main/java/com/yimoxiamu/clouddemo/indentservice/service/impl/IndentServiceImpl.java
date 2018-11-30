package com.yimoxiamu.clouddemo.indentservice.service.impl;

import com.yimoxiamu.clouddemo.indentservice.service.IndentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName IndentServiceImpl
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 17:22
 * @VERSION 1.0
 **/
@Service
@Slf4j
public class IndentServiceImpl implements IndentService {
    @Override
    public void countIndent(String orderId) {
      log.info("订单[{}]数目已经更改！",orderId);
    }
}
