package com.yimoxiamu.clouddemo.indentservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "user-service")
public interface UserApi {
    @RequestMapping(value = "/user/countVip")
    void countVip(@RequestParam(name = "orderId") String orderId);
}
