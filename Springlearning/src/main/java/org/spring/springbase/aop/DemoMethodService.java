package org.spring.springbase.aop;

import org.springframework.stereotype.Service;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 15:07 2017/12/20
 * @Modified By:
 **/
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("方法2----------------");
    }
}
