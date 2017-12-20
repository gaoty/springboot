package org.spring.springbase.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 15:08 2017/12/20
 * @Modified By:
 **/
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(org.spring.springbase.aop.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = (Action) method.getAnnotations()[0];
        System.out.println("after注解式拦截 "+action.name());
    }
    @Before("execution(* org.spring.springbase.aop.*.*(..))")
    public  void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("before方法规则式拦截 "+method.getName());
    }

}
