package org.spring;

import org.spring.configuration.ScopeCofig;
import org.spring.service.scope.DemoPrototypeService;
import org.spring.service.scope.DemoSingletonService;
import org.spring.springbase.aop.AopConfig;
import org.spring.springbase.aop.DemoAnnotationService;
import org.spring.springbase.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:gaoty
 * @created 2018/1/24 19:46
 **/


public class Main {
    public static void main(String[] args) {
        //初始化容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeCofig.class);

        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);
        System.out.println(demoSingletonService1);
        System.out.println(demoSingletonService2);
        System.out.println("s1和s2是否相等："+demoSingletonService1.equals(demoSingletonService2));
        System.out.println(demoPrototypeService1);
        System.out.println(demoPrototypeService2);
        System.out.println("p1和p2是否相等："+demoPrototypeService1.equals(demoPrototypeService2));

        context.close();
    }
}
