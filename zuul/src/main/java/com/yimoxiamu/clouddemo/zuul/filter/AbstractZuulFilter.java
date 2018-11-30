package com.yimoxiamu.clouddemo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AbstractZuulFilter
 * @Description TODO
 * @Author paw
 * @Date 2018/11/27 18:04
 * @VERSION 1.0
 **/
@Slf4j
public class AbstractZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("进入zuul过滤器网关，当前请求路径为：[{}]",request.getServletPath());
        return null;
    }
}
