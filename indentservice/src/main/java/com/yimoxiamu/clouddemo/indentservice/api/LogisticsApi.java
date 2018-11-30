package com.yimoxiamu.clouddemo.indentservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "logistics-service")
@Component
public interface LogisticsApi {
    @RequestMapping(value = "/logistics/pull")
    void pullLogistics(@RequestParam(name = "orderId") String orderId);
}
