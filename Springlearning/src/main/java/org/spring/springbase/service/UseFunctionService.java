package org.spring.springbase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:gaoty
 * @Description:
 * @Date：Created in 14:12 2017/12/20
 * @Modified By:
 **/
@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
