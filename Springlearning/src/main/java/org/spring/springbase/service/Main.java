package org.spring.springbase.service;

import org.spring.springbase.configuration.DiConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 14:26 2017/12/20
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        //初始化容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.printf(useFunctionService.sayHello("tingyan"));

        context.close();
    }
}
