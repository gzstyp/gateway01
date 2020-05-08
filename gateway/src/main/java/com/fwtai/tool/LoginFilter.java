package com.fwtai.tool;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 过滤器
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-08 15:56
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Component
public class LoginFilter implements GlobalFilter, Ordered{

    // 因为可以定义多个过滤器，所以返回的数字越小就越先执行
    @Override
    public int getOrder(){
        return -256;
    }

    @Override
    public Mono<Void> filter(final ServerWebExchange exchange,final GatewayFilterChain chain){
        System.out.println("拦截……");
        return chain.filter(exchange);//如果不符合就放行
    }
}