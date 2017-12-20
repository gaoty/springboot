package org.spring.springbase.aop;

import org.spring.springbase.service.UseFunctionService;
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService methodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        methodService.add();

        context.close();
    }
}
