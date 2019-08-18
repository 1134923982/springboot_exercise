package com.exercises.exercise.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.exercises.exercise.services.*.*(..))")
    public void pc1(){

    }

    @Before(value = "pc1()")
    public void before(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println(name+" method begin...");
    }

    @After(value="pc1()")
    public void after(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println(name+" method end ...");
    }

    @AfterReturning(returning = "result", pointcut = "pc1()")
    public void afterReturning(JoinPoint jp, Object result){
        String name = jp.getSignature().getName();
        System.out.println(name+" method return:" + result);
    }

    @AfterThrowing(value="pc1()", throwing = "e")
    public void afterReturning(JoinPoint jp, Exception e){
        String name = jp.getSignature().getName();
        System.out.println(name+" method throw exception:" + e.getMessage());
    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        return pjp.proceed();
    }


}
