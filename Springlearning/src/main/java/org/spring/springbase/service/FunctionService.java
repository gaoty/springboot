package org.spring.springbase.service;

import org.springframework.stereotype.Service;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 14:05 2017/12/20
 * @Modified By:
 **/
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "hello "+ word +"!";
    }
}
