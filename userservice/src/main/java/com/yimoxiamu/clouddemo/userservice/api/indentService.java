package com.yimoxiamu.clouddemo.userservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "indent-service")
public interface indentService {
    @RequestMapping(value = "/indent/hello")
    String hello(@RequestParam(value = "name") String name);
}
