package com.example.lost.ajc;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class RpcAspect {

    @Pointcut("execution(public * com.example.lost.controller..*(..))")
    private void resultPointCut() {}

    @Around("resultPointCut()")
    public Object resultResponseHandler(ProceedingJoinPoint pjp) throws Throwable {
        pjp.proceed();
        return "from aspect!";
    }

}
