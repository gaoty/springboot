package org.spring.springbase.aop;

import org.springframework.stereotype.Service;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 15:06 2017/12/20
 * @Modified By:
 **/
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("方法1----------------");
    }
}
