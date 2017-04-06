package com.zhuzz.springmvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by h3ilang on 2017/4/5.
 */
@Aspect
@Component
public class StringAspect {

    @Pointcut("execution(* com.zhuzz.springmvc.service.UserSearchService.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("----dobefore()开始----");
        System.out.println("执行业务逻辑前做一些工作");
        System.out.println("通过jointPoint获得所需内容");
        System.out.println("----dobefore()结束----");
    }
}
