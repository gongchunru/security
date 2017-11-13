package com.gchr.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author gongchunru
 * Date：2017/11/13.
 * Time：18:01
 */
@Aspect
@Component
public class TimeAspect {

    @Around("execution(* com.gchr.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("time aspect start");

        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            System.out.println("arg is "+arg);
        }

        long start = System.currentTimeMillis();

        Object object = pjp.proceed();

        System.out.println("time aspect 耗时:"+ (System.currentTimeMillis() - start));

        System.out.println("time aspect end");

        return object;
    }

}
